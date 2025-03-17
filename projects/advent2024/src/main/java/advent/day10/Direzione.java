package advent.day10;

public enum Direzione {
    UP(-1, 0),
    RIGHT(0, 1),
    DOWN(1, 0),
    LEFT(0, -1);

    public final int x;
    public final int y;

    Direzione(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Direzione getNextDirezione(Direzione corrente) {
        return switch (corrente) {
            case UP -> RIGHT;
            case RIGHT -> DOWN;
            case DOWN -> LEFT;
            case LEFT -> UP;
        };
    }


}
