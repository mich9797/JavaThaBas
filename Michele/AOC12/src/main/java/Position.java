public record Position(int x, int y) {
    @Override
    public String toString() {
        return String.format("Position (%d, %d)", x, y);
    }
}
