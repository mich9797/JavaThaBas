import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AOC18 {

    public static void main(String[] args){
        MemorySpace memorySpace = new MemorySpace(71,71);

        final var input = AOC18.class.getResourceAsStream("input");
        new BufferedReader(new InputStreamReader(input)).lines()
                .limit(1024)
                .forEach(row -> {
                    int[] coord = Arrays.stream(row.split(",")).mapToInt(Integer::parseInt).toArray();
                    memorySpace.getMemorySpace()[coord[1]][coord[0]].corruptCell();
                });

        memorySpace.reachTheExit(new Position(0,0), Direction.RIGHT);

        for (Cell[] c : memorySpace.getMemorySpace()){
            for(Cell cell : c){
//                System.out.printf("%5d", cell.getPoints());
                System.out.print(cell.getValue());
            }
            System.out.println();
        }
        System.out.println(memorySpace.getMemorySpace()[memorySpace.row-1][memorySpace.column-1].getPoints());
    }
}
