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

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void move(){
        this.coordinates.setX(this.coordinates.getX() + this.speed.getX());
        this.coordinates.setY(this.coordinates.getY() + this.speed.getY());
    }
}
