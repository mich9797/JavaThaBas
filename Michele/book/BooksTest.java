class Books {
    String title;
    String author;
}

public class BooksTest{
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "The grapes of java";
        myBooks[1].title = "The java gatsby";
        myBooks[2].title = "The java cookbook";
        
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3){
            System.out.println(myBooks[x].title + " by " + myBooks[x].author);
            x = x +1;
        }
    }
}