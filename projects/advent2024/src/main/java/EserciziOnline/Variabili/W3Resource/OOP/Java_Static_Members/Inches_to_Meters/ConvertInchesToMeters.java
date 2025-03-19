package EserciziOnline.Variabili.W3Resource.OOP.Java_Static_Members.Inches_to_Meters;

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
