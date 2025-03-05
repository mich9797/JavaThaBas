import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class AOC9 {
    public static void main(String[] args){
        InputStream input = AOC9.class.getResourceAsStream("input");
        final String stringa = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining());

        //int a = Integer.parseInt(String.valueOf(stringa.charAt(0)));
        //int b = Character.getNumericValue(stringa.charAt(0));

        StringBuilder stringaCostruita = compilaStringa(stringa);

        System.out.println(stringaCostruita);

    }

    public static StringBuilder compilaStringa(String stringa){
        int id = 0;
        boolean scriviId = true;
        StringBuilder stringaFinale = new StringBuilder();

        for (int numeroNellaStringa=0; numeroNellaStringa < stringa.length(); numeroNellaStringa++){
            int ripetizioni = Character.getNumericValue(stringa.charAt(numeroNellaStringa));
            if(scriviId){
                for (int i=0; i < ripetizioni; i++){
                    stringaFinale.append(id);       //ripeto l'id n volte
                }
                id++;
                scriviId = false;
            }else {
                for (int i=0; i < ripetizioni; i++){
                    stringaFinale.append('.');      //ripeto . n volte
                }
                scriviId = true;
            }
        }
        return stringaFinale;
    }
}
