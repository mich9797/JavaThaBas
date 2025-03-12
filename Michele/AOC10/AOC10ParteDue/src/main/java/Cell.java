
public class Cell {
    private final int number;
    private final Position position;

    public Cell(int number, Position position) {
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public Position getPosition() {
        return position;
    }

}
