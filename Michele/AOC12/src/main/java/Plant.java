public class Plant {
    private char valore;
    private int visitato;

    public char getValore() {
        return valore;
    }

    public int getVisitato() {
        return visitato;
    }

    public void setValore(char valore) {
        this.valore = valore;
    }

    public void setVisitato(int visitato) {
        this.visitato = visitato;
    }

    public Plant(char valore) {
        this.valore = valore;
        this.visitato = 0;
    }
}
