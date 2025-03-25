package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_2;

// Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class,
// set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Cipollotto", "Bassotto");
        Dog dog2 = new Dog("Thor", "Alano");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        System.out.println("\nSet new dog1 Breed and dog2 Name");

        dog1.setBreed("Sparviero");
        dog2.setName("Scassino");

        System.out.println(dog1.getName() + " is now a  " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a  " + dog2.getBreed() + ".");


    }
}
