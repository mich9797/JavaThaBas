package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_6;


//Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage.
// Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
// However, only provide a getter method for the mileage variable.
public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setCompany_name("Hyunday");
        car.setModel_name("I20");
        car.setYear(2011);

        String company_name = car.getCompany_name();
        String Model_name = car.getModel_name();
        int year = car.getYear();
        double mileage = car.getMileage();

        System.out.println("Company name: " + company_name);
        System.out.println("Model Name: " + Model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);




    }
}
