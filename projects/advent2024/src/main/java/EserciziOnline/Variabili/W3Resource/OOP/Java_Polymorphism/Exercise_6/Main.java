package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_6;

//Write a Java program to create a class Shape with methods getArea() and getPerimeter().
// Create three subclasses: Circle, Rectangle, and Triangle.
// Override the getArea() and getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.

public class Main {
    public static void main(String[] args) {

        double r = 4.0;
        Circle circle = new Circle(r);

        double rt1 = 5, rt2 = 8;
        double tr1 = 3, tr2 = 4, tr3 = 5;

        Rectagle rectagle = new Rectagle(rt1, rt2);
        Triangle triangle = new Triangle(tr1, tr2, tr3);

        System.out.println("Radius of the Circle"+r);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());

        System.out.println("\nSides of the Rectangle: " + rt1 + "," + rt2);
        System.out.println("Area of the Rectangle: " + rectagle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectagle.getPerimeter());

        System.out.println("\nSides of the Triangle: " + tr1 + "," + tr2 + "," + tr3);
        System.out.println("Area of the Triangle: " + triangle.getArea());
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());





    }
}
