public class Cell {
    private char value;
    private Position position;

    public Cell(char value, Position position) {
        this.value = value;
        this.position = position;
    }

    public char getValue() {
        return value;
    }

    public Position getPosition() {
        return position;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int sumCellValue(){
        return (100 * this.position.getX()) + this.position.getY();
    }

    @Override
    public String toString() {
        return "Cell{" +
                "value=" + value +
                ", position=" + position +
                '}';
    }
}
