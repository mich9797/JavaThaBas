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
                        coppieRegole.add(leggiCoppie(riga));  //leggo la riga e divido i due numeri da "|"
                    }else if(!riga.isEmpty()){
                        sequenze.add(salvaSequenza(riga)); // leggo la riga e separo i numeri dalla ","
                    }
                }); 

            int somma = 0;
            for (List<Integer> rigaSequenza : sequenze){  //rigasequenza = 75 47 61 53 29
                boolean sequenzaCorretta = esaminoSequenza(rigaSequenza, coppieRegole);   //controllo che la rigaSequenza sia valida
                if (sequenzaCorretta){
                    somma += valoreDimezzo(rigaSequenza);    //sommo valore di mezzo
                }
            }

            System.out.println(somma);

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

    public static boolean esaminoSequenza(List<Integer> rigaSequenza, List<List<Integer>> coppieRegole){
        for (int i=0; i < rigaSequenza.size(); i++){
            int numero = rigaSequenza.get(i);
            List<Integer> tempRegole = regolePerNumero(numero, coppieRegole); //memorizzo le regole per il numero trovato
            boolean controllo = controlloRegole(tempRegole, rigaSequenza, i); //verifico che non vengano infrante regole
            if(!controllo){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> regolePerNumero(int numero, List<List<Integer>> coppieRegole){
        List<Integer> tempRegole = new ArrayList<>();
        for (List<Integer> coppia : coppieRegole){
            if(coppia.get(0) == numero){
                tempRegole.add(coppia.get(1));
            }
        }
        return tempRegole;
    }

    public static boolean controlloRegole(List<Integer> tempRegole, List<Integer> rigaSequenza, int i){
        for (int j=i; j>=0; j--){
            if(tempRegole.contains(rigaSequenza.get(j))){
                return false;
            }
        }
        return true;
    }

    public static int valoreDimezzo(List<Integer> rigaSequenza){
        int posizione = rigaSequenza.size()/2;
        return rigaSequenza.get(posizione);
    }

}