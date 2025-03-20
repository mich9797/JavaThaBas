package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_10;


// Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.


public class Main {

    public static void main(String[] args) {

      Desktop desktop = new Desktop();

      desktop.setBrand("Samsung");
      desktop.setProcessor("I7 v.2.0 daje ooohhhh");
      desktop.setRamSize(18);

      desktop.upgradeRam(24);

      System.out.println("Desktop brand name: " + desktop.getBrand());
      System.out.println("Desktop processor model: " + desktop.getProcessor());
      System.out.println("Desktop ram: " + desktop.getRamSize() +"GB");



    }
}
