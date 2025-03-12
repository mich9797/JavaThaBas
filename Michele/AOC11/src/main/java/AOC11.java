import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AOC11 {
    public static void main(String[] args) {
        var input = AOC11.class.getResourceAsStream("input");
        List<Long> numbers = new BufferedReader(new InputStreamReader(input)).lines().flatMap(riga -> Arrays.stream(riga.split(" ")))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        for (int i=0; i < 25; i++){
            rules(numbers);
        }

        System.out.println(numbers.size());
    }

    public static void rules(List<Long> numbers){
        for( int i=0; i < numbers.size(); i++){
            int condition;
            if (Long.toString(numbers.get(i)).length() %2 == 0){
                condition = -1;
            }else if(numbers.get(i) == 0){
                condition = 0;
            }else {
                condition = 1;
            }
            switch (condition){
                case 0:
                    numbers.set(i , 1L);
                    break;
                case -1:
                    int half = Long.toString(numbers.get(i)).length() / 2;
                    long num1 = Long.parseLong(Long.toString(numbers.get(i)).substring(0,half));
                    long num2 = Long.parseLong(Long.toString(numbers.get(i)).substring(half));
                    numbers.add(i, num1);
                    numbers.set(i+1, num2);
                    i++;  // aumento i per evitare che il cilo esamini anche il secondo numero che ho appena aggiunto
                    break;
                default:
                    numbers.set(i, numbers.get(i)*2024);
            }
        }
    }
}
