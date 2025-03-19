package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Convert_Minutes_to_Years_and_Days;

import java.util.Scanner;

public class ConvertMinutestoYearsAndDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes= ");
        double minutes = input.nextDouble();

        double years = minutes/525600;
        double days = minutes/1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");



    }
}
