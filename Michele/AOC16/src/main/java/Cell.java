public class Cell {
    private char letter;
    private int points;
    private Position cellPos;

    public Cell(char letter, Position position) {
        this.cellPos = position;
        this.letter = letter;
        this.points = -1;
    }

    public char getLetter() {
        return letter;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Position getCellPos() {
        return cellPos;
    }
}
