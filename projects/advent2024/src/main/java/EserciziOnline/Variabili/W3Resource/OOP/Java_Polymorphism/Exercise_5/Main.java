package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_5;


// Write a Java program to create a base class Sports with a method called play().
// Create three subclasses: Football, Basketball, and Rugby.
// Override the play() method in each subclass to play a specific statement for each sport.

public class Main {
    public static void main(String[] args) {

            Sport sport = new Sport();

            Rugby rugby = new Rugby();
            Basketball basketball = new Basketball();
            Football football = new Football();

            sport.Play();
            football.Play();
            basketball.Play();
            football.Play();



    }
}
