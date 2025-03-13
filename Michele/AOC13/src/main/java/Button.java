public class Button {
    private final Coordinates coordinates;
    private int max;
    private int cont;

    public Button(Coordinates coordinates) {
        this.coordinates = coordinates;
        this.max = 100;
        this.cont = 0;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void reduceMax(){
        setMax(getMax() -1);
    }

    public void incrCont(){
        setCont(getCont() +1);
    }

    public void resetCont(){
        setCont(0);
    }
}
