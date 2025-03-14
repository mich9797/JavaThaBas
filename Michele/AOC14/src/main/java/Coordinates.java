public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void checkCoordinates(int[][] matrix){
        if(this.x < 0){
            setX(this.x + matrix.length);
        }else if(this.x >= matrix.length){
            setX(this.x - matrix.length);
        }

        if(this.y < 0){
            setY(this.y + matrix[0].length);
        }else if(this.y >= matrix[0].length){
            setY(this.y - matrix[0].length);
        }
    }
}
