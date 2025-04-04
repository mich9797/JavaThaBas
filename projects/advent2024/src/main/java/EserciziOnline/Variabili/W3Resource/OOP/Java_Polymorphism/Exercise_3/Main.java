package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_3;



//Write a Java program to create a base class Shape with a method called calculateArea().
// Create three subclasses: Circle, Rectangle, and Triangle.
// Override the calculateArea() method in each subclass to calculate and return the shape's area.

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(5,9);
        System.out.println("Area of Triangle: " + triangle.calculateArea());

    }
}
