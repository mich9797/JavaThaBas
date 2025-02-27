package Michele.AdventOfCode.Day6.Day6primo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GuardGallivant {
    public static void main(String[] args) throws IOException {
        final List<String> linee = Files.readAllLines(Paths.get("input6.txt"));

        final int riga = linee.size();
        final int colonna = linee.get(0).length();
        char[][] matrix = new char[riga][colonna];

        final Pawn pawn = new Pawn();
        Direction direction = Direction.UP;
        int mosse = 0;
        boolean isFinished = false;

        for (int i = 0; i < riga; i++) { // ho riempito la matrice e salvato posizione pedina
            for (int j = 0; j < colonna; j++) {
                matrix[i][j] = linee.get(i).charAt(j);
                if (matrix[i][j] == '^') {
                    pawn.setX(i);
                    pawn.setY(j);
                }
            }
        }
        if (pawn.getX() == null || pawn.getY() == null) {
            throw new IllegalStateException("pawn not initialized");
        }
        final DirectionChecker checker = new DirectionChecker('#', 'X');
        while (!isFinished) {
            final Move move = checker.tryDirection(direction, pawn.getX(), pawn.getY(), matrix);
            switch (move) {
                case EXIT:
                    System.out.println("Game completed with success!");
                    isFinished = true;
                    movePawn(pawn, matrix, direction);
                    mosse++;
                    break;
                case DENY:
                    direction = Direction.getNextCW(direction);
                    break;
                case ALLOW:
                    movePawn(pawn, matrix, direction);
                    mosse++;
                    break;
                case ALREADY_PASSED:
                    movePawn(pawn, matrix, direction);
                    break;
            }
        }

        final int digits = String.valueOf(riga).length();
        for (int i = 0; i < riga; i++) {
            System.out.printf("%" + digits +"d ", i);
            for (int j = 0; j < colonna; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println(mosse);

    }

    public static void movePawn(Pawn pawn, char[][] matrix, Direction direction) {
        matrix[pawn.getX()][pawn.getY()] = 'X';
        pawn.move(direction);
    }

    public enum Direction {
        UP(-1, 0),
        RIGHT(0, 1),
        DOWN(1, 0),
        LEFT(0, -1);

        public final int x;
        public final int y;

        public static Direction getNextCW(Direction current) {
            return switch (current) {
                case UP -> RIGHT;
                case RIGHT -> DOWN;
                case DOWN -> LEFT;
                case LEFT -> UP;
            };
        }

        Direction(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class DirectionChecker {

        private final char wall;
        private final char alreadyPassed;

        public DirectionChecker(char wall, char alreadyPassed) {
            this.wall = wall;
            this.alreadyPassed = alreadyPassed;
        }

        public Move tryDirection(Direction direction, int xPos, int yPos, char[][] matrix) {
            final int estimatedX = xPos + direction.x;
            final int estimatedY = yPos + direction.y;
            if (estimatedX >= matrix.length || estimatedX < 0 || estimatedY >= matrix[0].length || estimatedY < 0) {
                return Move.EXIT;
            }
            final char destination = matrix[xPos + direction.x][yPos + direction.y];
            if (destination == wall) {
                return Move.DENY;
            }
            if (destination == alreadyPassed) {
                return Move.ALREADY_PASSED;
            }
            return Move.ALLOW;
        }
    }

    public enum Move {
        ALLOW, DENY, ALREADY_PASSED, EXIT
    }

    public static class Pawn {
        private Integer xPosition;
        private Integer yPosition;

        public Pawn() {
        }

        public Integer getX() {
            return xPosition;
        }

        public void setX(int x) {
            xPosition = x;
        }

        public Integer getY() {
            return yPosition;
        }

        public void setY(int yPosition) {
            this.yPosition = yPosition;
        }
        
        public void move(Direction direction) {
            xPosition += direction.x;
            yPosition += direction.y;
        }
    }
}