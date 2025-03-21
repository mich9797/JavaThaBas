public class Cell {
    private Sign sign;
    private Position position;

    public Cell(Sign sign, Position position) {
        this.sign = sign;
        this.position = position;
    }

    public Sign getSign() {
        return sign;
    }

    public Position getPosition() {
        return position;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public int sumCellValue(){
        return (100 * this.position.getX()) + this.position.getY();
    }

    @Override
    public String toString() {
        return "Cell{" +
                "value=" + sign +
                ", position=" + position +
                '}';
    }
}
