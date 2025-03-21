import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AOC15 {
    public static void main(String[] args){
        final var input = AOC15.class.getResourceAsStream("input");
        List<String> file = new ArrayList<>();
        List<String> moves = new BufferedReader(new InputStreamReader(input)).lines()
                .peek(riga -> {
                    if (riga.contains(String.valueOf(Symbol.WALL.getC()))){
                        file.add(riga);
                    }
                })
                .filter(riga -> !riga.contains(String.valueOf(Symbol.WALL.getC())))
                .toList();

        House house = new House(file);

        moves.forEach(riga -> {
            for(int i=0; i < riga.length(); i++){
                Direction direction = Direction.whatDirection(riga.charAt(i));//creo una direzione in base al carattere che trovo
                Cell cellRobot = house.cellAtPosition(house.getRobot());
                if (house.tryToMoveInDirection(cellRobot, direction)){  //vedo se posso muovermi in quella direzione
                    house.changeCells(cellRobot, direction);
                    house.getRobot().setPositionAtDirection(direction);  //sposto posizione della pedina
                }
            }
        });

        int tot = Arrays.stream(house.getMatrix())
                .flatMap(Arrays::stream)
                .filter(cell -> cell.getValue()== Symbol.BOX.getC())
                .mapToInt(Cell::sumCellValue)
                .sum();

        System.out.println(tot);

//        for(Cell[] c : house.getMatrix()){
//            for(Cell cel : c){
//                System.out.print(cel.getValue());
//            }
//            System.out.println();
//        }
//
//        for (String s : moves){
//            System.out.println(s);
//        }
    }
}
