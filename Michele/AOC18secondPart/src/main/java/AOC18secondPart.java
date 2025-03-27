import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class AOC18secondPart {

    public static void main(String[] args){
        MemorySpace memorySpace = new MemorySpace(71,71);

        final var input = AOC18secondPart.class.getResourceAsStream("input");
        Optional<int[]> firstImportantObstacle = new BufferedReader(new InputStreamReader(input)).lines()
                .map(row -> {
                    int[] coord = Arrays.stream(row.split(",")).mapToInt(Integer::parseInt).toArray();
                    memorySpace.getMemorySpace()[coord[1]][coord[0]].corruptCell();
                    memorySpace.resetLabirint();
                    if(memorySpace.reachTheExit(new Position(0,0), Direction.RIGHT)){
                        return null;
                    }
                    return coord;
                })
                .filter(Objects::nonNull)
                .findFirst();

        if(firstImportantObstacle.isPresent()){
            System.out.println(Arrays.toString(firstImportantObstacle.get()));
        }else {
            System.out.println("nessun ostacolo impedisce l'uscita");
        }


//        for (Cell[] c : memorySpace.getMemorySpace()){
//            for(Cell cell : c){
////                System.out.printf("%5d", cell.getPoints());
//                System.out.print(cell.getValue());
//            }
//            System.out.println();
//        }
    }
}
