import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> linee = new ArrayList<>();
        try {
            linee = Files.readAllLines(Paths.get("input6.txt"));

        } catch (Exception e) {
            System.err.println("errore lettura file: " + e.getMessage());
            // TODO: handle exception
        }

        final int riga = linee.size();
        final int colonna = linee.get(0).length();
        char[][] matrice = new char[riga][colonna];

        int[] pedina = new int[2];
        Direction direzione = Direction.UP;
        int mosse = 0;
        boolean isFinished = false;

        for (int i = 0; i < riga; i++) { // ho riempito la matrice e salvato posizione pedina
            for (int j = 0; j < colonna; j++) {
                matrice[i][j] = linee.get(i).charAt(j);
                if (matrice[i][j] == '^') {
                    pedina[0] = i;
                    pedina[1] = j;
                }
            }
        }
        final DirectionChecker checker = new DirectionChecker();
        while (!isFinished) {
            final Move move = checker.tryDirection(direzione, pedina[0], pedina[1], matrice);
            switch (move) {
                case EXIT:
                    System.out.println("Game completed with success!");
                    isFinished = true;
                    break;
                case DENY:
                    direzione = Direction.getNextCW(direzione);
                    break;
                case ALLOW:
                    muoviPedina(pedina, matrice, direzione);
                    mosse++;
                    break;
                case ALREADY_PASSED:
                    muoviPedina(pedina, matrice, direzione);
                    break;
            }
        }

        for (int i = 0; i < riga; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < colonna; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }

        mosse++;
        System.out.println(mosse);

    }

    public static void muoviPedina(int[] pedina, char[][] matrice, Direction direzione) {
        matrice[pedina[0]][pedina[1]] = 'X';
        pedina[0] += direzione.x;
        pedina[1] += direzione.y;
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
        public Move tryDirection(Direction direction, int xPos, int yPos, char[][] matrice) {
            final int estimatedX = xPos + direction.x;
            final int estimatedY = yPos + direction.y;
            if (estimatedX >= matrice.length || estimatedX < 0 || estimatedY >= matrice[0].length || estimatedY < 0) {
                return Move.EXIT;
            }
            final char destination = matrice[xPos + direction.x][yPos + direction.y];
            if (destination == '#') {
                return Move.DENY;
            }
            if (destination == 'X') {
                return Move.ALREADY_PASSED;
            }
            return Move.ALLOW;
        }
    }

    public enum Move {
        ALLOW, DENY, ALREADY_PASSED, EXIT
    }

}