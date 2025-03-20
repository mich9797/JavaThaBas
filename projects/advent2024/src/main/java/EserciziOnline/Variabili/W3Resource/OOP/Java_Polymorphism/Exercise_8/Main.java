package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_8;


// Write a Java program to create a base class Shape with methods draw() and calculateArea().
// Create three subclasses: Circle, Square, and Triangle.
// Override the draw() method in each subclass to draw the respective shape, and override the
// calculateArea() method to calculate and return the area of each shape.
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(8.5);
        Shape square = new Square(4.57);
        Shape triangle = new Triangle(7.5,4.3);


        drawShapeandCalculateArea(circle);
        drawShapeandCalculateArea(square);
        drawShapeandCalculateArea(triangle);

    }

    public static void drawShapeandCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}
