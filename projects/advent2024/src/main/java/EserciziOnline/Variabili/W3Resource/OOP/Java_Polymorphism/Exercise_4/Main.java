package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_4;

// Write a Java program to create a class Employee with a method called calculateSalary().
// Create two subclasses Manager and Programmer.
// In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.


public class Main {
    public static void main(String[] args) {

        Employee man1 = new Manager("Alessandro Zoratti", 5000, 25000);
                System.out.println("Manager name: " + man1.getNome() + "\nRole: " + man1.getRole() + "\nSalary: $" + man1.calculateSalary());


                Employee man2 = new Programmer("Valter Veltroni", 1500, 7500);
        System.out.println("Manager name: " + man2.getNome() + "\nRole: " + man2.getRole() + "\nSalary: $" + man2.calculateSalary());

    }
}
