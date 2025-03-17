package EserciziOnline.Variabili.Università.Verona;

import java.util.Scanner;

public class Esercizio3 {

    public static void main (String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int sup;

        System.out.println("Inserire l'estremo superiore dell'intervallo di ricerca: ");
        sup = tastiera.nextInt();

        System.out.println("I numeri primi minori (o uguali) di " + sup +" sono ");
        printPrimes(sup);
        System.out.println();
    }

    public static void printPrimes(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}