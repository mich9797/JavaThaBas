package advent.day9;

import java.io.BufferedReader;
import java.io.InputStream;
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
        Mappa compila = new Mappa();
       List<Integer> codice = compila.compile(lines);
        Ordina imposta = new Ordina();
       imposta.sort(codice);
        Calcolo somma = new Calcolo();
       long total = somma.calcoloIlTotale(codice);
       System.out.println(total);
    }
}
