import java.util.List;

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

    public boolean coordinataGiaVisitata(List<Posizione> lista){
        for (Posizione posizione : lista){
            if (this.x == posizione.getx() && this.y == posizione.gety()){
                return true;
            }
        }
        return false;
    }
}
