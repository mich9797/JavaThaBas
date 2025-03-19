package EserciziOnline.Variabili.W3Resource.OOP.Java_Static_Members.Java_aritmetics;

public class Counter {

    static int count = 0;

    public Counter () {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
