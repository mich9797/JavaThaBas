public class Box extends Cell{
    private Position secondPosition;

    public Box(char value, Position position, Position secondPosition) {
        super(value, position);
        this.secondPosition = secondPosition;
    }

    public Position getSecondPosition() {
        return secondPosition;
    }
}
