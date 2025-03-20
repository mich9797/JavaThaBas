package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_2;

//Write a Java program to create a class Vehicle with a method called speedUp().
// Create two subclasses Car and Bicycle.
// Override the speedUp() method in each subclass to increase the vehicle's speed differently.

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bycicle bycicle = new Bycicle();

        car.speedUp();
        bycicle.speedUp();
        vehicle.speedUp();

    }
}
