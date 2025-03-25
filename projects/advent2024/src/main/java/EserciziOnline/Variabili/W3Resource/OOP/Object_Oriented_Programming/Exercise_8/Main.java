package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_8;


// Write a Java program to create class called "TrafficLight"
// with attributes for color and duration,
// and methods to change the color and check for red or green.


public class Main {
    public static void main(String[] args) {

        TrafficLights lights = new TrafficLights("green", 20);

        System.out.println("The light is green: " + lights.isGreen());

        System.out.println("The light is red: " + lights.isRed());

        lights.changeColor("red");

        System.out.println("The light is now red: " + lights.isRed());
        System.out.println("The light duration is now: " + lights.getDuration());

        lights.setDuration(30);

        System.out.println("The light duration is now: " + lights.getDuration());

    }
}
