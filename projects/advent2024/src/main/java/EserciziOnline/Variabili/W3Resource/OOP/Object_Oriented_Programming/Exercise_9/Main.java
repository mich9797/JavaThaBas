package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_9;


// Write a Java program to create a class called "Employee" with a name, salary,
// and hire date attributes, and a method to calculate years of service.


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Asdrubale Caracalla", 9500, LocalDate.parse("2020-03-01"));
        Employee employee2 = new Employee("Paiasso Mona", 750, LocalDate.parse("2020-03-01"));
        Employee employee3 = new Employee("Zenigada", 1500, LocalDate.parse("2020-03-01"));

        employee1.employeeDetails();
        System.out.println("Years of service: " + employee1.getYearOfService());

        employee2.employeeDetails();
        System.out.println("Years of service: " + employee2.getYearOfService());

        employee3.employeeDetails();
        System.out.println("Years of service: " + employee3.getYearOfService());

    }
}
