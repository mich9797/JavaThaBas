public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position positionAtDirection(Direction direction){
        return new Position((this.x + direction.x), (this.y + direction.y));
    }
}
