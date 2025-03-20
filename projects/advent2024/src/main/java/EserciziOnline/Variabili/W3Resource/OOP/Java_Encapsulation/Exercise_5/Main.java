package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_5;




//Write a Java program to create a class called Circle with a private instance variable radius.
// Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea()
// and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setRadius(4.5);

        double radius = circle.getRadius();
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();


        System.out.println("Circle radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);


    }
}
