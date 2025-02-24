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
                            .map(Gioco2secondo::parseReport) // ritorna List<Integer> di ogni riga
                            .filter(Gioco2secondo::valido)
                            .count();

            System.out.println("report validi " + valid);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Integer> parseReport(String s) { //trasformo in lista la riga
        return Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .toList();
    }

    private static boolean cresce(List<Integer> report){ //controllo se crescente con max 1 errore
        int errore  = 0;
        for (int i=0; i < report.size()-1; i++){
            if (report.get(i) > report.get(i+1)){
                errore++;
                if (errore > 1){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean decre(List<Integer> report){  //controllo se decrescente con max 1 errore
        int errore  = 0;
        for (int i=0; i < report.size()-1; i++){
            if (report.get(i) < report.get(i+1)){
                errore++;
                if (errore > 1){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean valido(List<Integer> report){
        if(cresce(report) || decre(report)){
            int errore = 0;
            for (int i = 0; i < report.size() - 1; i++) {
                int distance = Math.abs(report.get(i) - report.get(i + 1));
                if(distance < 1 || distance > 3){
                    errore++;
                    if(errore > 1){
                        return false;
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }
}