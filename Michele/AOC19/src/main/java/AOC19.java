import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AOC19 {
    public static void main(String[] args) {

            var input = AOC19.class.getResourceAsStream("input");
            List<String> towel = new ArrayList<>();
            List<String> combination = new ArrayList<>();

            new BufferedReader(new InputStreamReader(input)).lines()
                    .forEach(row -> {
                        if (row.contains(",")) {
                            String[] smallTowel = row.split(", ");
                            towel.addAll(Arrays.asList(smallTowel));
                        } else if (!row.isEmpty()) {
                            combination.add(row);
                        }
                    });

            long valid = combination.stream()
                    .map(comb-> chekCombination(comb,towel))
                    .filter(e -> e)
                    .count();

            System.out.println(valid);
    }

    public static boolean chekCombination(String comb, List<String> towel){
        if (comb.isEmpty()){
            return true;
        }
        for (String pieceOfTowel : towel){
            if (comb.startsWith(pieceOfTowel)){
                String smallComb = comb.substring(pieceOfTowel.length());
                if (chekCombination(smallComb, towel)){
                    return  true;
                }
            }
        }
        return false;
    }
}
