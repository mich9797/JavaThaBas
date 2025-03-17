package EserciziOnline.Variabili.W3Resource.JavaDatatypes;

import java.util.Scanner;

public class ConvertFarenheitToCelciusDegree {

    public static void main(String[] Strings) {


        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in farenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9);
        System.out.println(fahrenheit+" degree in fahrenheit is equal to "+celsius +" in Celsius");

    }


}

