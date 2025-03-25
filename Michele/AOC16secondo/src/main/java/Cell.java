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

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Position getCellPos() {
        return cellPos;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "letter=" + letter +
                ", points=" + points +
                ", cellPos=" + cellPos +
                '}';
    }
}
