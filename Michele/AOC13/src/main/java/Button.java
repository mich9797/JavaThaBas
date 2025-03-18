public class Button {
    private final Coordinates coordinates;
    private int max;

    public Button(Coordinates coordinates) {
        this.coordinates = coordinates;
        this.max = 100;
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

    public void decrMax(){
        setMax(getMax() -1);
    }

}
