package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_1;


// Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class,
// set their attributes using the constructor, and print their name and age.


public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Gabriele Basello", 24);
        Person person2 = new Person("Laura Sfetez", 25);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old");

        person1.setAge(15);
        person2.setAge(18);
        person1.setName("Asdrubale Ciquita");

        System.out.println("Set new age");

        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old");

    }
}
