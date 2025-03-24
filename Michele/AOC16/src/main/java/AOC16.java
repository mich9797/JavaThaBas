import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class AOC16 {
    public static void main(String[] args){
        final var input = AOC16.class.getResourceAsStream("input");
        final List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();

        Labirint labirint = new Labirint(file);

        labirint.play(labirint.getPawn(), Direction.RIGHT);
        System.out.println(labirint.cellAtPosition(labirint.getEnd()).getPoints());

//        for(Cell[] c : labirint.getMatrix()){
//            for(Cell cel : c){
//                System.out.print(cel.getPoints() + "  ");
//            }
//            System.out.println();
//        }
    }
}
