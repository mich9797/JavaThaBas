package EserciziOnline.Variabili.W3Resource.OOP.Java_Static_Members.Static_Block;

public class Initializer {
    static int initialVariable ;

    static {
        initialVariable = 1000;
        System.out.println("Statick block: initialVariable inizialised to " + initialVariable);
    }
}
