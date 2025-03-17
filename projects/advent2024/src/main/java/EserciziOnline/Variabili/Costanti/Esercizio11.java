package EserciziOnline.Variabili.Costanti;

public class Esercizio11 {
    public static void main (String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        String s3 = "Jav";

        // Compare strings lexicographically
        System.out.println("" + s1.compareToIgnoreCase(s2));
        System.out.println("" + s2.compareToIgnoreCase(s1));
        System.out.println("" + s1.compareToIgnoreCase(s3));

    }
}
