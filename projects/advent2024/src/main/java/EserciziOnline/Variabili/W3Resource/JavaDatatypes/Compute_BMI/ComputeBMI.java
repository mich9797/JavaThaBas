package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Compute_BMI;

import java.util.Scanner;

public class ComputeBMI {

    // Write a Java programm to compute the body mass indez (BMI)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");


    }
}
