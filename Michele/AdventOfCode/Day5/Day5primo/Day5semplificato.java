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
            int somma = 0;

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
                        
                        boolean corretto = true;
                        for (int i=0; i < seqNum.size(); i++){
                            int n1 = seqNum.get(i);
                            int n2 = seqNum.get(i+1);
                            
                            for (List<Integer> coppia : regole){
                                if (coppia.get(0) == n1){
                                    if (coppia.get(1) == n2){
                                        int temp = n1;
                                        seqNum.set(i, n2);
                                        seqNum.set(i+1, temp);
                                        corretto = false;
                                        return;
                                    }
                                }
                            }
                            if (!corretto){
                                return;
                            }
                        }
                        if (corretto){
                            somma += valoreDimezzo(seqNum);
                        }
                    }
                });  

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