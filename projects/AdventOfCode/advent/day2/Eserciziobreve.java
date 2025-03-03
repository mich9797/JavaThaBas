package advent.day2;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Eserciziobreve {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("insersici un imput minore di dieci miliardi: ");

        if (in.hasNextLong()) {


            long n = in.nextLong();

            if (n < 0)

            {

                n *= -1;

            }
            if (n >= 10000000000L) {

                System.out.println("Numero uguale o più grande di 10 miliardi") ;
            }
            else
            {

                int digits = 1;

                if (n >= 10 && n < 100)
                {
                    digits = 2;

                }
                else if (n >= 100 && n < 1000)
                {
                    digits = 3;

                }
                else if (n >= 1000 && n < 10000)
                {

                    digits = 4;

                }
                else if (n >= 10000 && n < 100000) {

                    digits = 5;
                } else if (n >= 100000 && n < 1000000) {

                    digits = 6;

                } else if (n >= 1000000 && n < 1000000) {
                    digits = 7;
                } else if (n >= 1000000 && n < 10000000) {
                    digits = 8;
                } else if (n >= 10000000 && n < 100000000) {
                    digits = 9;
                } else if (n >= 100000000 && n < 1000000000) {
                    digits = 10;
                } else if (n >= 1000000000 && n < 10000000000L) {
                    digits = 11;
                }
                System.out.println("Cifre del numero intero: " + digits);
            }

        }
        else {

            System.out.println("Il numero non è intero");
        }


    }
}

