package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.OverloadingConstructorwithDifferentDataTypes;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }
}
