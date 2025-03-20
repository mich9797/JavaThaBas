package EserciziOnline.Variabili.W3Resource.OOP.Java_Encapsulation.Exercise_8;


//Write a Java program to create a class called “Book” with private instance variables title, author, and price.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.
public class Main {
    public static void main(String[] args) {

        Book book = new Book();

        book.setAuthor("J.R.R.tolkien");
        book.setTitle("LOTR: The Return Of The King");
        book.setPrice(29.99);

        book.applyDiscount(10);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" +  book.getPrice());
    }
}
