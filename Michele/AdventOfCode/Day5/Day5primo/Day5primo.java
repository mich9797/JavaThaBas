import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Day5primo{
    public static void main(String[] args){
        try {
            var src = new BufferedReader(new InputStreamReader(new FileInputStream("input5.txt")));
            List<List<Integer>> coppieRegole = new ArrayList<>(); 
            List<List<Integer>> sequenze = new ArrayList<>();

            src.lines()
                .forEach(riga -> {
                    if(!riga.isEmpty() && riga.length() == 5){
                        coppieRegole.add(leggiCoppie(riga));  //leggi la riga e dividi numeri da |
                    }else if(!riga.isEmpty()){
                        sequenze.add(salvaSequenza(riga)); // salva in array e splitta su ","
                    }
                }); 

            for (List<Integer> rigaSequenza : sequenze){  //rigasequenza = 75 47 61 53 29
                for (int i=0; i < rigaSequenza.size(); i++){
                    int numero = rigaSequenza.get(i);  //75
                    List<Integer> regole = regolePerNumero(numero);
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static List<Integer> leggiCoppie(String riga){
        return Arrays.stream(riga.split("\\|"))
                    .map(Integer::parseInt)
                    .toList();
    }

    public static List<Integer> salvaSequenza(String riga){
        return Arrays.stream(riga.split(","))
                    .map(Integer::parseInt)
                    .toList();
    }

    public static List<Integer> regolePerNumero(int numero){
        
    }
}