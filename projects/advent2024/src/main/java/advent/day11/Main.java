package advent.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args){
        var input = Main.class.getResourceAsStream("input.txt");
        if (input == null) {
            System.err.println("Input file not found");
            return;
        }
        List<Long> numeri = new BufferedReader(new InputStreamReader(input))
                .lines()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(Long::parseLong).collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < 25; i++) {
            applyRules(numeri);
        }

        System.out.println(numeri.size());
    }

    public static void applyRules(List<Long> numeri){
        for (int i = 0; i < numeri.size(); i++) {
            int condizione = 0;
            if (Long.toString(numeri.get(i)).length() % 2 == 0) {
                condizione = -1;
            } else if (numeri.get(i) == 0) {
                condizione = 0;
            }

            switch (condizione) {
                case 0:
                    numeri.set(i, 1L);
                    break;
                case -1:
                    int half = Long.toString(numeri.get(i)).length() / 2;
                    long num1 = Long.parseLong(Long.toString(numeri.get(i)).substring(0, half));
                    long num2 = Long.parseLong(Long.toString(numeri.get(i)).substring(half));
                    numeri.add(i, num1);
                    numeri.set(i + 1, num2);
                    i++;
                    break;
                default:
                    numeri.set(i, numeri.get(i) * 2024);
            }
        }
    }
}
