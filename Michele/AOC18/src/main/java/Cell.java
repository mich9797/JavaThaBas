public class Cell {
    private char value;
    private int points;
    private Position cellPosition;

    public Cell(Position position) {
        this.value = '.';
        this.points = 0;
        this.cellPosition = position;
    }

    public Position getCellPosition() {
        return cellPosition;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public char getValue() {
        return value;
    }

    public void corruptCell() {
        this.value = '#';
    }
}
