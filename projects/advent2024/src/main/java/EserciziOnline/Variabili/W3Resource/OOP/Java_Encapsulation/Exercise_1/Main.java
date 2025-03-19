package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_1;

//Write a Java program to create a class called Person with private instance variables name, age. and country.
// Provide public getter and setter methods to access and modify these variables.

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Andrea Cadutti");
        person.setAge(87);
        person.setCountry("Zurigo");

        String name = person.getName();
        String country = person.getCountry();
        int age = person.getAge();

      System.out.println("Name: " +  name);
      System.out.println("Country: " + country);
      System.out.println("Age: " + age);

    }
}
