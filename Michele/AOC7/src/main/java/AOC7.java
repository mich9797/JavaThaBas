import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class AOC7 {
    public static void main(String[] args) {
        var input = AOC7.class.getResourceAsStream("input");
        final List<String> linee = new BufferedReader(new InputStreamReader(input)).lines().toList();

        long sommaDelleRigheValide = linee.stream()
                .mapToLong(riga -> {
                    long valoreFinale = valoreFinale(riga); //numero che dovrei ottenere
                    int[] numeri = prendiNumeri(riga);  // array con i numeri che devo usare

                    if (isRigaValid(valoreFinale, numeri, 0, numeri[0])){
                        return valoreFinale;
                    }else{
                        return 0;
                    }
                })
                .sum();

        System.out.println(sommaDelleRigheValide);

        //long sommaRigheValide = 0;

        //for (String riga : linee){
        //    long valoreFinale = valoreFinale(riga); //numero che dovrei ottenere
        //    int[] numeri = prendiNumeri(riga);  // array con i numeri che devo usare
        //
        //    if(isRigaValid(valoreFinale, numeri, 0, numeri[0])) {
        //        sommaRigheValide += valoreFinale;
        //    }
        //}
        //System.out.println(sommaRigheValide);
    }

    public static boolean isRigaValid(long valoreFinale, int[] numeri, int index, long tot){
        if(index == numeri.length-1){
            if (valoreFinale == tot){
                return true;
            }else {
                return false;
            }
        }
        if(isRigaValid(valoreFinale, numeri, index+1, tot + numeri[index+1])){
            return true;
        }else if(isRigaValid(valoreFinale, numeri, index+1, tot * numeri[index+1])){
            return true;
        }
        return false;
    }

    public static long valoreFinale(String riga){
        String[] separaRiga = riga.split(": ");
        long valoreFinale = Long.parseLong(separaRiga[0]);
        return valoreFinale;
    }

    public static int[] prendiNumeri(String riga){
        String[] separaRiga = riga.split(": ");
        String[] rigaNumeri = separaRiga[1].split(" ");
        int[] numeri = new int[rigaNumeri.length];  // array con i numeri che devo usare
        for (int i = 0; i < rigaNumeri.length; i++){
            numeri[i] = Integer.parseInt(rigaNumeri[i]);
        }
        return numeri;
    }

}
