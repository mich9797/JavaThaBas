public class Button {
    private final Coordinates coordinates;
    private int max;

    public Button(Coordinates coordinates) {
        this.coordinates = coordinates;
        this.max = 100;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void decrMax(){
        setMax(getMax() -1);
    }

    public Coordinates buttonAtMax(){
        return new Coordinates((this.coordinates.getX()*this.max), (this.coordinates.getY()*this.max));
    }
}
