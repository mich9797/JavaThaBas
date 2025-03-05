public class Coppia {
    private char simbolo;
    private int antinode;

    public char getSimbolo() {
        return simbolo;
    }

    public int getAntinode() {
        return antinode;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public void setAntinode(int antinode) {
        this.antinode = antinode;
    }

    public Coppia(char simbolo) {
        this.simbolo = simbolo;
        this.antinode = 0;
    }
}
