public class Cell {
    private Sign sign;
    private final Position position;

    public Cell(Sign sign, Position position) {
        this.sign = sign;
        this.position = position;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public Position getPosition() {
        return position;
    }

    public int sumCellSign(){
        return (100 * this.position.getX()) + this.position.getY();
    }

}
