import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class AOC16secondo {
    public static void main(String[] args){
        final var input = AOC16secondo.class.getResourceAsStream("input");
        final List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();

        Labirint labirint = new Labirint(file);

        labirint.play(labirint.getPawn(), Direction.RIGHT);
        System.out.println(labirint.cellAtPosition(labirint.getEnd()).getPoints());
        labirint.setBestPath(labirint.getEnd(), Direction.DOWN);

        long tot = Arrays.stream(labirint.getMatrix())
                .flatMap(Arrays::stream)
                .filter(c -> c.getLetter() == 'O')
                .count();

        System.out.println(tot);


        for(Cell[] c : labirint.getMatrix()){
            for(Cell cel : c){
                System.out.printf("%5d  ", cel.getPoints());
//                System.out.print(cel.getLetter() + " ");
            }
            System.out.println();
        }

        for(Cell[] c : labirint.getMatrix()){
            for(Cell cel : c){
//                System.out.printf("%5d  ", cel.getPoints());
                System.out.print(cel.getLetter() + " ");
            }
            System.out.println();
        }
    }
}
