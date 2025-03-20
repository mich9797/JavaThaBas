package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_9;


// Write a Java program to create a class called Smartphone with private instance variables brand, model, and storageCapacity.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by that value.

public class Main {

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        smartphone.setBrand("IPhone");
        smartphone.setModel("Cacca Liquida");
        smartphone.setStoragecapacity(256);

        smartphone.increaseCapacity(40);

        System.out.println("Smartphone Brand Name: " + smartphone.getBrand());
        System.out.println("Smartphone Model: " + smartphone.getModel());
        System.out.println("Smartphone storage Capacity: " + smartphone.getStoragecapacity() + "GB");


    }
}
