package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Sum_of_Digits_in_Integers;

import java.util.Scanner;

public class SumofDigitsinInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");

        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int ThirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int FourthDigit = remainingNumber % 10;
        int sum = ThirdDigit + SecondDigit + firstDigit + FourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }

}
