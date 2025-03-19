package EserciziOnline.Variabili.W3Resource.OOP.Java_Constructor.ConstructorOverloading;

public class Book {

    String title;
    String author;
    double price;

    public Book() {
        this.title = title;
        this.author = author;
        this.price = 0.0;

    }

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
        this.price = 0.0;

    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;


    }
}
