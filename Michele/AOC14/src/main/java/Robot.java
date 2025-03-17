public class Robot {
    private Coordinates coordinates;
    private final Coordinates speed;

    public Robot(Coordinates coordinates, Coordinates speed) {
        this.speed = speed;
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Coordinates getSpeed() {
        return speed;
    }
}
