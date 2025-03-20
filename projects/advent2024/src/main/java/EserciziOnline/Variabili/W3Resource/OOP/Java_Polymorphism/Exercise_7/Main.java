package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_7;


//Write a Java program to create a base class Animal with methods move() and makeSound().
// Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves.
// Also, override the makeSound() method in each subclass to make a specific sound for each animal.
public class Main {

    public static void main(String[] args) {

       Animal bird = new Bird();
       Animal panthera = new Panthera();

       performAction(bird);
       performAction(panthera);

    }

    public static void performAction(Animal animal) {

        animal.Move();
        animal.makeSound();

    }


}
