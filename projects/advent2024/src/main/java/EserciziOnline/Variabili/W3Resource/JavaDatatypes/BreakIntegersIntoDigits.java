package EserciziOnline.Variabili.W3Resource.JavaDatatypes;

import java.util.Scanner;

public class BreakIntegersIntoDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Input six non-negative digits: ");
        int digit = input.nextInt();
        if (digit < 0 || digit > 999999) {
            System.out.println("The digit is a negative number");
        } else {

            int n1 = digit / 100000 % 10;
            int n2 = digit / 10000 % 10;
            int n3 = digit / 1000 % 10;
            int n4 = digit / 100 % 10;
            int n5 = digit / 10 % 10;
            int n6 = digit % 10;
            System.out.printf(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);


        }


        }
    }

