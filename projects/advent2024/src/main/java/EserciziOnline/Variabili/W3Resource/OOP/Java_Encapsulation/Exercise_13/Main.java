package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_13;


// Write a Java program to create a class called Movie with private instance variables title, director, and duration.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called getMovieDetails() that returns a formatted string containing the movie details.
public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie();

        movie.setTitle("2001");
        movie.setDirector("Stanley Kubrik");
        movie.setDuration(190);

        System.out.println(movie.getMovieDetails());
    }
}
