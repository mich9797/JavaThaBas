package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_11;


// Write a Java program to create a class called House with private instance variables address, numberOfRooms, and area.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called calculatePrice() that returns the price of the house based on its area and a price per square meter.
public class Main {
    public static void main(String[] args) {

        House house = new House();

        house.setAddress("Via Fruc 11");
        house.setArea(80);
        house.setNumberOfRooms(5);

        double price = house.calculatePrice(2000);

        System.out.println("House adress: " + house.getAddress());
        System.out.println("House area: " + house.getArea() + "mq");
        System.out.println("House number of rooms: " + house.getNumberOfRooms());
        System.out.println("House price: $" + price);
    }
}
