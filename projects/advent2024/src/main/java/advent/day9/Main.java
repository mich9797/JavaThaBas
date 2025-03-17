package advent.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var input = Main.class.getResourceAsStream("input");

       final String lines;
        lines = new BufferedReader(new InputStreamReader(input))
                .lines()
                .collect(Collectors.joining());

       List<Integer> codice = Mappa.compile(lines);
       Ordina.sort(codice);
       long total = Calcolo.calcoloIlTotale(codice);
       System.out.println(total);
    }
}
