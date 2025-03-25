package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_3;


//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2.0, 3.5);

        System.out.println("The rectangle1 area is: " +rectangle1.getArea());
        System.out.println("The rectangle1 perimeter is: " + rectangle1.getPeimeter());


        rectangle1.setHeigth(4.0);


        System.out.println("New rectangle1 area is: " + rectangle1.getArea());
        System.out.println("New rectangle1 perimeter is: " + rectangle1.getPeimeter());
    }
}
