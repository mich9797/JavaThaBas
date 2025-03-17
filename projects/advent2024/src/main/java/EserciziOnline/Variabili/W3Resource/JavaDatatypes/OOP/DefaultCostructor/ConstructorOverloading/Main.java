package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.ConstructorOverloading;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();

        System.out.println("Book title: " + book1.title);
        System.out.println("Book author: " + book1.author);
        System.out.println("Book price: " + book1.price);

        Book book2 = new Book("The Lord Of The Rings","J.R.R.Tolkien");

        System.out.println("Book2 title: " + book2.title);
        System.out.println("Book2 author: " + book2.author);
        System.out.println("Book2 price: " + book2.price);

        Book book3 = new Book("A Game Of Thrones","George R.R. Martin", 20.99);

        System.out.println("Book3 title: " + book3.title);
        System.out.println("Book3 author: " + book3.author);
        System.out.println("Book3 price: " + book3.price);


    }
}
