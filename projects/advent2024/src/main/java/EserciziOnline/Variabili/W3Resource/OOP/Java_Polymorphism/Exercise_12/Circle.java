package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_12;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Draw a circle");

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return  radius;
    }
}
