import java.util.List;

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


    public int getY() {
        return y;
    }

    public int moveAtQuadrant(Coordinates vector, int length, int width) {
        this.x = (this.x + (vector.x * 100)) % length;
        if (this.x < 0){
            this.x += length;
        }
        this.y = (this.y + (vector.y * 100)) % width;
        if (this.y < 0){
            this.y += width;
        }
        return quadrantForCoordinates(length, width);
    }

    public int quadrantForCoordinates(int length, int width){
        int halfX = length/2;
        int halfY = width/2;
        if (this.x < halfX){
            if(this.y < halfY){
                return 0;
            }else if(this.y > halfY){
                return 2;
            }
        }else if(this.x > halfX){
            if(this.y < halfY){
                return 1;
            }else if(this.y > halfY) {
                return 3;
            }
        }
        return 4;
    }
}
