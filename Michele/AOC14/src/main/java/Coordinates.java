import java.util.Optional;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates add(Coordinates other) {
        return new Coordinates(this.x + other.x, this.y + other.y);
    }

    public Coordinates scalarMul(int factor) {
        return new Coordinates(this.x * factor, this.y * factor);
    }

    public Coordinates modulus(int length, int width) {
        return new Coordinates(Math.floorMod(this.x, length), Math.floorMod(this.y, width));
    }

    public enum Quadrant {
        TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT
    }
    public Optional<Quadrant> quadrant(int length, int width) {
        int halfX = length/2;
        int halfY = width/2;
        if (this.x < halfX){
            if(this.y < halfY){
                return Optional.of(Quadrant.TOP_LEFT);
            }else if(this.y > halfY){
                return Optional.of(Quadrant.BOTTOM_LEFT);
            }
        }else if(this.x > halfX){
            if(this.y < halfY){
                return Optional.of(Quadrant.TOP_RIGHT);
            }else if(this.y > halfY) {
                return Optional.of(Quadrant.BOTTOM_RIGHT);
            }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return String.format("%d %d", this.x, this.y);
    }
}
