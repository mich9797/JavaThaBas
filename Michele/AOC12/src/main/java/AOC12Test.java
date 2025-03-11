import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AOC12Test {
    public static void main(String[] args) {

        final var input = AOC12Test.class.getResourceAsStream("input");
        final List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();

        final int righe = file.size();
        final int colonne = file.get(0).length();
        final Cell[][] matrice = new Cell[righe][colonne];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrice[i][j] = new Cell(file.get(i).charAt(j), new Position(i, j));
            }
        }
        final var garden = new Garden(matrice);
        final var results = calculate(garden);
        System.out.println(results.stream().mapToInt(AreaAndPerimeter::multiply).sum());
    }

    public static List<AreaAndPerimeter> calculate(Garden garden) {
        final List<AreaAndPerimeter> result = new ArrayList<>();
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden.width; j++) {
                final var currentCell = garden.getCellAtPosition(i, j).orElseThrow();
                if (!currentCell.isVisited()) {
                    result.add(areaAndPerimeter(garden, currentCell));
                }
            }
        }
        return result;
    }

    public static AreaAndPerimeter areaAndPerimeter(Garden garden, Cell cell) {
        return areaAndPerimeter(garden, cell, new ArrayList<>());
    }

    public static AreaAndPerimeter areaAndPerimeter(Garden garden, Cell cell, List<Cell> checked) {
        cell.visit();
        checked.add(cell);
        final var areaAndPerimeter = new AreaAndPerimeter();
        areaAndPerimeter.area += 1;
        final char cellValue = cell.getValue();
        Arrays.stream(Direction.values())
                .map(dir -> garden.getCellAtDirection(cell, dir))
                .filter(opt -> opt.map(c -> !checked.contains(c)).orElse(true))
                .forEach(nextCell -> {
                    if (nextCell.map(Cell::getValue).map(value -> value != cellValue).orElse(true)) {
                        areaAndPerimeter.perimeter += 1;
                    } else {
                        areaAndPerimeter.add(areaAndPerimeter(garden, nextCell.get(), checked));
                    }
                });
        return areaAndPerimeter;
    }

    public static class AreaAndPerimeter {
        private int area = 0;
        private int perimeter = 0;

        public void add(AreaAndPerimeter other) {
            this.area += other.area;
            this.perimeter += other.perimeter;
        }

        public int multiply() {
            return area * perimeter;
        }
    }

    public static class Garden {
        private final Cell[][] matrix;
        public final int length;
        public final int width;

        public Garden(Cell[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                throw new IllegalArgumentException("cannot construct empty garden");
            }
            if (Arrays.stream(matrix).mapToInt(row -> row.length).distinct().count() != 1) {
                throw new IllegalArgumentException("cannot construct garden with rows of different lengths");
            }
            this.matrix = matrix;
            this.length = matrix.length;
            this.width = matrix[0].length;
        }

        public Optional<Cell> getCellAtPosition(int x, int y) {
            if (!contains(x, y)) {
                return Optional.empty();
            }
            return Optional.of(matrix[x][y]);
        }

        public Optional<Cell> getCellAtPosition(Position position) {
            return getCellAtPosition(position.x(), position.y());
        }

        private boolean contains(int x, int y) {
            return !(x < 0 || x >= this.matrix.length || y < 0 || y >= this.matrix[0].length);
        }

        public Optional<Cell> getCellAtDirection(Cell current, Direction direction) {
            final var nextPosition = new Position(current.getPosition().x() + direction.x, current.getPosition().y() + direction.y);
            return getCellAtPosition(nextPosition);
        }

    }
}
