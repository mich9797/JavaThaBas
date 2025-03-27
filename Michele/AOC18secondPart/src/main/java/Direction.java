public enum Direction{
    UP (-1, 0),
    RIGHT (0, +1),
    DOWN (+1, 0),
    LEFT (0, -1);

    public final int x;
    public final int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Direction getOppositeDirection(Direction direction){
        return switch (direction){
            case RIGHT -> LEFT;
            case DOWN -> UP;
            case LEFT -> RIGHT;
            default -> DOWN;
        };
    }
}