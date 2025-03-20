package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_5;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter()  {
        return 2*Math.PI*radius;
    }
}
