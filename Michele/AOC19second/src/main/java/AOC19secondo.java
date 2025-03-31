import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AOC19secondo {
    public static void main(String[] args) {

        var input = AOC19secondo.class.getResourceAsStream("input");
        List<String> towel = new ArrayList<>();
        AtomicInteger cont = new AtomicInteger();

        new BufferedReader(new InputStreamReader(input)).lines()
                .forEach(row -> {
                    if (row.contains(",")) {
                        String[] smallTowel = row.split(", ");
                        towel.addAll(Arrays.asList(smallTowel));
                    } else if (!row.isEmpty()) {

                        cont.addAndGet(chekCombination(row, towel));
                    }
                });

        System.out.println(cont);
    }

    public static int chekCombination(String comb, List<String> towel){
        int cont = 0;
        if (comb.isEmpty()){
            return 1;
        }
        for (String pieceOfTowel : towel){
            if (comb.startsWith(pieceOfTowel)){
                String smallComb = comb.substring(pieceOfTowel.length());
                cont += chekCombination(smallComb, towel);
            }
        }
        return cont;
    }
}
