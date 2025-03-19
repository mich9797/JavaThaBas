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
                    if (riga.contains("#")){
                        file.add(riga);
                    }
                })
                .filter(riga -> !riga.contains("#"))
                .toList();

        final int righe = file.size();
        final int colonne = file.get(0).length();
        final Cell[][] matrix = new Cell[righe][colonne];

        Position pawn = new Position(); //pedina di che si muove

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if(file.get(i).charAt(j) == '@'){
                    pawn.setX(i);// mi salvo la posizione della pedina
                    pawn.setY(j);
                }
                matrix[i][j] = new Cell(file.get(i).charAt(j), new Position(i, j));
            }
        }

        House house = new House(matrix);

        moves.forEach(riga -> {
                    for(int i=0; i < riga.length(); i++){
                        Direction direction = Direction.whatDirection(riga.charAt(i));//creo una direzione in base al carattere che trovo
                        Cell cellPawn = house.cellAtPosition(pawn);
                        if (house.tryToMoveInDirection(cellPawn, direction)){  //vedo se posso muovermi in quella direzione
                            house.tryChangeCells(cellPawn, direction);
                            pawn.setPositionAtDirection(direction);  //sposto posizione della pedina
                        }
                    }
                });

        int tot = Arrays.stream(house.getMatrix())
                .flatMap(Arrays::stream)
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
