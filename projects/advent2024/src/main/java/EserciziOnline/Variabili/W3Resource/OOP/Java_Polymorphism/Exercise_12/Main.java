package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_12;


// Write a Java program to create a base class Shape with methods draw() and calculateArea().
// Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape.
// In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.

import org.w3c.dom.UserDataHandler;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(7);
        Shape cylinder = new Cylinder(4.0, 9.0);

        drawShapeAndCalculateArea(circle);
        drawShapeAndCalculateArea(cylinder);

    }

    public static void drawShapeAndCalculateArea (Shape shape){
        shape.draw();

        double area = shape.calculateArea();

        System.out.println("Area: " + area);
    }
}
