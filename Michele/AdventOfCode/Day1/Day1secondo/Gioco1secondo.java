import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gioco1secondo{
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        int tot = 0;

        try {
            List<String> lines = Files.readAllLines(Paths.get("input1.txt"));

            for (String line : lines){

                String[] valori = line.split("   ");

                int a = Integer.parseInt(valori[0]);
                lista1.add(a);

                int b = Integer.parseInt(valori[1]);
                lista2.add(b);
            }

            for (int numero : lista1) {
                tot += ripetizioni(lista2, numero);
            }
            
            System.out.println(tot);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public static int ripetizioni(List<Integer> lista, int num){
        int somma = 0;
        for (int numLista : lista) {
            if(numLista == num){
                somma += num;
            }
        }
        return somma;
    }
}