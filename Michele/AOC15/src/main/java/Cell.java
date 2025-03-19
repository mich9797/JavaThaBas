public class Cell {
    private char value;
    private final Position position;

    public Cell(char value, Position position) {
        this.value = value;
        this.position = position;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Position getPosition() {
        return position;
    }

    public int sumCellValue(){
        if (this.value == 'O'){
            return (100 * this.position.getX()) + this.position.getY();
        }
        return 0;
    }

}
