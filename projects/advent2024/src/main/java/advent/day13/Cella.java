package advent.day13;

public class Cella {

    private int numberi;
    private Bottone position;

    public Cella(int numberi, Bottone position) {
        this.numberi = numberi;
        this.position = position;
    }

    public void setCell(int number, Bottone position) {
        this.numberi = number;
        this.position = position;
    }

    public int getNumber() {
        return numberi;
    }

    public Bottone getPosition() {
        return position;
        
    }
}