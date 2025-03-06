import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AOC9 {
    public static void main(String[] args){
        InputStream input = AOC9.class.getResourceAsStream("input");
        final String stringa = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining());

        List<Integer> codice = compilaCodice(stringa);

        ordinaCodice(codice);

        System.out.println(calcolaTot(codice));
    }

    public static List<Integer> compilaCodice(String stringa){
        int id = 0;
        boolean scriviId = true;
        List<Integer> codice = new ArrayList<>();

        for (int idx=0; idx < stringa.length(); idx++){
            int ripetizioni = Character.getNumericValue(stringa.charAt(idx)); //per gestire il carattere prelevato come un numero intero
            if(scriviId){
                for (int i=0; i < ripetizioni; i++){
                    codice.add(id);       //ripeto l'id n volte
                }
                id++;
                scriviId = false;
            }else {
                for (int i=0; i < ripetizioni; i++){
                    codice.add(-1);      //ripeto . n volte
                }
                scriviId = true;
            }
        }
        return codice;
    }

    public static void ordinaCodice(List<Integer> codice){
        for (int i=0; i < codice.size(); i++){
            if(codice.get(i) == -1){
                int idx = recuperaPosizioneUltimoNum(codice);
                if ( idx <= i){
                    break;
                }
                int num = codice.get(idx);
                codice.set(idx, codice.get(i));
                codice.set(i, num);
            }
        }
    }

    public static int recuperaPosizioneUltimoNum(List<Integer> codice){
        for (int i=codice.size()-1; i >= 0; i--){
            if(codice.get(i) != -1){
                return i;
            }
        }
        return -1;
    }

    public static long calcolaTot(List<Integer> codice){
        long tot = 0;
        for (int i=0; i < codice.size(); i++){
            if(codice.get(i) != -1){
                tot += (codice.get(i)*i);
            }else {
                break;
            }
        }
        return tot;
    }
}
