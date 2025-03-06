public class Posizione {
    private int x;
    private int y;

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public Posizione(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void sposta(Direzione direzione){
        this.x += direzione.x;
        this.y += direzione.y;
    }
}
