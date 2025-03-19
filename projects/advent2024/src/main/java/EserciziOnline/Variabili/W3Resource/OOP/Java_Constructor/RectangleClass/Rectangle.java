package EserciziOnline.Variabili.W3Resource.OOP.Java_Constructor.RectangleClass;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.width = rectangle.width;
    }
}
