public class Position {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Direction dir){
        switch (dir){
            case UP:
                setX(getX() + dir.x);
                setY(getY() + dir.y);
                break;
            case RIGHT:
                setX(getX() + dir.x);
                setY(getY() + dir.y);
                break;
            case DOWN:
                setX(getX() + dir.x);
                setY(getY() + dir.y);
                break;
            default:
                setX(getX() + dir.x);
                setY(getY() + dir.y);
        }
    }
}
