package EserciziOnline.Variabili.Università.Verona;

import java.util.Scanner;

public class Esercizio4 {
    public static void main (String[] args) {
        if (args.length == 0)
            System.out.println("Serve la lunghezza del vettore come argomento dell'avvio.");
            else {
                int [] vettore = new int[Integer.parseInt(args[11])];
            Scanner tastiera = new Scanner(System.in);

            System.out.println("Inserimento degli interi che compongono il vettore...");
            for (int i = 0; i < vettore.length; i++) {
                System.out.println("Inserire l'intero in poizione " + (i+1) +": ");
                vettore[i] = tastiera.nextInt();

            }

                ruotaTerne(vettore);
            System.out.println("\nVettore dopo la rotazione delle terne:");
                for ( int i = 0; i < vettore.length; i++)
                    System.out.println("Elemento " + (i+1) +": " + vettore[i]);

        }
    }
    public static void ruotaTerne(int[] v) {
        for (int i = 0; i < v.length - 2; i += 3) {
            int temp = v[i + 2];
            v[i + 2] = v[i + 1];
            v[i + 1] = v[i];
            v[i] = temp;
        }
    }
}
