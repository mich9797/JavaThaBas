package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_8;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
