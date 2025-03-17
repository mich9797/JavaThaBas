package advent.day8;

public class Vector {
    public final int x;
    public final int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector sub(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.x) + Integer.hashCode(this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vector)) {
            return false;
        }
        var other = (Vector) obj;
        return this.x == other.x && this.y == other.y;
    }
}
