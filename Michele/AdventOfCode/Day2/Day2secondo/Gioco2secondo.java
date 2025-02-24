import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Gioco2secondo {

    public static void main(String[] args) {
        try {
            var src = new BufferedReader(new InputStreamReader(new FileInputStream("input2.txt")));

            var valid = src.lines()
                    .map(Gioco2secondo::parseReport)
                    .filter(Gioco2secondo::controlloFinale)
                    .count();

            System.out.format("Valid record count is: %d\n", valid);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean is_valid(List<Integer> report) {
        var forward = new ArrayList<>(report);
        Collections.sort(forward);

        var backward = new ArrayList<>(report);
        Collections.sort(backward, (a, b) -> -a.compareTo(b));

        if (!report.equals(forward) && !report.equals(backward)) {
            return false;
        }


        Stream<Integer> distances = null; // report.stream()
                // .windows(2)
                // .map((a,b) -> Math.abs(a - b))
                // .noneMatch(d -> d < 1 || d > 3);

        for (int i = 0; i < report.size() - 1; i++) {
            int distance = Math.abs(report.get(i) - report.get(i + 1));
            if (distance < 1 || distance > 3) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> parseReport(String s) {
        return Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .toList();
    }

    private static boolean controlloFinale(List<Integer> report){
        if(is_valid(report)){
            return true;
        }
        int cont = 0;
        for(int i=0; i < report.size() -1; i++){
            List<Integer> copia = new ArrayList<>(report);
            copia.remove(i);
            if (is_valid(copia)){
                return true;
            }
        }
        return false;
    }
}
