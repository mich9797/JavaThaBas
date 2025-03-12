import java.util.Optional;

public class TopographicMap {
    private final Cell[][] matrix;
    public int length;
    public int width;

    public TopographicMap(Cell[][] matrix) {
        this.matrix = matrix;
        this.length = matrix.length;
        this.width = matrix[0].length;
    }

    public boolean contains(int x, int y){
        return !(x < 0 || x >= this.length || y < 0 || y >= this.width);
    }

    public boolean contains(Position position){
        return contains(position.getx(), position.gety());
    }

    public boolean contains(Cell cell){
        return contains(cell.getPosition());
    }

    public Optional<Cell> getCellAtPosition(int x, int y){
        if (!contains(x,y)){
            return Optional.empty();
        }
        return Optional.of(matrix[x][y]);
    }

    public Optional<Cell> getCellAtPosition(Position position){
        return getCellAtPosition(position.getx(), position.gety());
    }

    public Optional<Cell> getCellAtDirection(Cell cell, Direction direction){
        Position nextPosition = new Position(cell.getPosition().getx() + direction.x, cell.getPosition().gety() + direction.y);
        return getCellAtPosition(nextPosition.getx(), nextPosition.gety());
    }


}
