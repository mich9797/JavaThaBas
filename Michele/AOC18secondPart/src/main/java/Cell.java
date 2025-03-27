public class Cell {
    private char value;
    private boolean isVisited;
    private Position cellPosition;

    public Cell(Position position) {
        this.value = '.';
        this.isVisited = false;
        this.cellPosition = position;
    }

    public Position getCellPosition() {
        return cellPosition;
    }

    public boolean isVisited() {
        return this.isVisited;
    }

    public void setVisited(boolean bol) {
        this.isVisited = bol;
    }

    public char getValue() {
        return value;
    }

    public void corruptCell() {
        this.value = '#';
    }
}
