public enum Direction {
    UP(-1, 0),
    RIGHT(0, 1),
    DOWN(1, 0),
    LEFT(0, -1);

    public final int x;
    public final int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Direction getNextDirezione(Direction corrente) {
        return switch (corrente) {
            case UP -> RIGHT;
            case RIGHT -> DOWN;
            case DOWN -> LEFT;
            case LEFT -> UP;
        };
    }
}