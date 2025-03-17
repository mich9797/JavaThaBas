package EserciziOnline.Variabili.W3Resource.JavaDatatypes;

import java.util.Scanner;

public class ConvertInchesToMeters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a value of inch: ");
        double inch = input.nextDouble();

        double meters = ((inch )/39.75);
        System.out.println(inch + "inch is " + meters + " meters");
    }
}
