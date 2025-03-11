import java.util.Objects;

public class Cell {
    private final char value;
    private final Position position;
    private boolean visited = false;

    public Cell(char value, Position position) {
        this.value = value;
        this.position = position;
        this.visited = false;
    }

    public char getValue() {
        return value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void visit() {
        this.visited = true;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cell cell = (Cell) o;
        return value == cell.value && visited == cell.visited && Objects.equals(position, cell.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, visited, position);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "valore=" + value +
                ", visitato=" + visited +
                ", position=" + position +
                '}';
    }
}
