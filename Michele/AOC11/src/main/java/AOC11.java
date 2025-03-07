
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AOC11 {
    public static void main(String[] args) {
        var input = AOC11.class.getResourceAsStream("input");
        List<String> lista = new BufferedReader(new InputStreamReader(input)).lines().toList();

        List<Long> numLista = lista.stream().flatMap(riga -> Arrays.stream(riga.split(" ")))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        for (int i=0; i < 25; i++){
            rules(numLista);
        }

        System.out.println(numLista.size());
    }

    public static void rules(List<Long> lista){
        for( int i=0; i < lista.size(); i++){
            long condition;
            if (Long.toString(lista.get(i)).length() %2 == 0){
                condition = -1;
            }else {
                condition = lista.get(i);
            }
            switch ((int) condition){
                case 0:
                    lista.set(i , 1L);
                    break;
                case -1:
                    int half = Long.toString(lista.get(i)).length() / 2;
                    long num1 = Long.parseLong(Long.toString(lista.get(i)).substring(0,half));
                    long num2 = Long.parseLong(Long.toString(lista.get(i)).substring(half));
                    lista.add(i, num1);
                    lista.set(i+1, num2);
                    i++;
                    break;
                default:
                    lista.set(i, lista.get(i)*2024);
            }
        }
    }
}
