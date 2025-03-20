package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_1;


// Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
// Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Cat cat = new Cat();
        Bird bird = new Bird();

        animal.Sound();
        cat.Sound();
        bird.Sound();



    }
}
