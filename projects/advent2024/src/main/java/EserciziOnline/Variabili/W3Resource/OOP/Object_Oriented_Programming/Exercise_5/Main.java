package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_5;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Lord of the Rings", "J.R.R.tolkien", "67349523475824");
        Book book2 = new Book("Art of war", "Sun Tzu", "3636362457547");

        Book.addBook(book1);
        Book.addBook(book2);

        ArrayList<Book> bookCollection = Book.get_BookCollection();

        System.out.println("List of books: ");

        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

        Book.removeBook(book1);

        System.out.println("List of books: ");

        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " ISBN " + book.getISBN());
        }
    }
}
