package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Java_Static_Members.Static_variables;

public class Counter {

    static int count = 0;

    public Counter () {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
