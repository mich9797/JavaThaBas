package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_5;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String ISBN;

    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Book(String title,String author,String ISBN) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    public static ArrayList<Book> get_BookCollection() {
        return bookCollection;
    }
}
