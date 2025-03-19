package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Display_Current_time_in_GMT;

import java.util.Scanner;

public class DisplayCurrentTimeInGTM {

    // Write a java program that prints the current time in GTM

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
    }
}
