package EserciziOnline.Variabili.Università.Verona;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserire la prima stringa: ");
        String s1 = input.nextLine();

        System.out.print("Inserire la seconda stringa: ");
        String s2 = input.nextLine();

        if (s1.length() > s2.length()) {

            String result = s2 + s1.substring(s2.length());
            System.out.println("Stringa risultante: " + result);
        } else {
            System.out.println("La prima stringa non e’ piu’ lunga della seconda.");
        }

        input.close();
    }
}