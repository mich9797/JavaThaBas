package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_3;

public class Rectangle {

    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getPeimeter() {
        return (2*width) +  (2*heigth);
    }

    public double getArea() {
        return width * heigth;
    }
}
