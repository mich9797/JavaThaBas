package Michele.AdventOfCode.Day5.Day5primo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Day5semplificato{
    public static void main(String[] args) {

        try {
            var src = new BufferedReader(new InputStreamReader(new FileInputStream("input5.txt")));

            List<List<Integer>> regole = new ArrayList<>();   //potrebbe essere una lista di Pair (vai a vedere)
            List<Integer> daSommare = new  ArrayList<>();

            src.lines()
                .forEach(riga -> {
                    if(!riga.isEmpty() && riga.length() == 5){
                        regole.add(leggiCoppie(riga));  //leggo la riga e divido i due numeri da "|"
                    }else if(!riga.isEmpty()){

                        String[] sequenza = riga.split(",");
                        List<Integer> seqNum = new ArrayList<>();
                        for (String num : sequenza) {
                            seqNum.add(Integer.parseInt(num));
                        }
                        
                        boolean isCorretto = true;
                        for (int i=0; i < seqNum.size()-1; i++){
                            int n1 = seqNum.get(i);
                            int n2 = seqNum.get(i+1);
                            
                            for (List<Integer> coppia : regole){
                                if (coppia.get(0) == n2){
                                    if (coppia.get(1) == n1){
                                        int temp = n1;
                                        seqNum.set(i, n2);
                                        seqNum.set(i+1, temp);
                                        isCorretto = false;
                                        break;
                                    }
                                }
                            }
                            if(!isCorretto){
                                break;
                            };
                        }
                        if(isCorretto){
                            daSommare.add(valoreDimezzo(seqNum));
                        }
                    }
                });

                int somma = 0;
                for (int num : daSommare) {
                    somma += num;
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

    public static int valoreDimezzo(List<Integer> rigaSequenza){
        int posizione = rigaSequenza.size()/2;
        return rigaSequenza.get(posizione);
    }

}