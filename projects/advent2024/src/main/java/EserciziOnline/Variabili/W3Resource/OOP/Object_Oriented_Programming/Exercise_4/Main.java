package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_4;

//Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute.
// Calculate the area and circumference of the circle.

public class Main {
    public static void main(String[] args) {

        int r = 5;

        Circle circle = new Circle(r);

        System.out.println("The radius of the circle is: " + r);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());

        r = 8;

        circle.setRadius(r);

        System.out.println("The radius of the circle is: " + r);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());
    }
}
