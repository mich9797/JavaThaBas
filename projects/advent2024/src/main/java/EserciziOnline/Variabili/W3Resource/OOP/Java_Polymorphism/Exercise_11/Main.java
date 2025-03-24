package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_11;


// Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
// Create two subclasses Car and Motorcycle.
// Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        startAndStopEngine(car);
        startAndStopEngine(motorcycle);
    }

    public static void startAndStopEngine(Vehicle vehicle) {
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
