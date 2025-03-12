import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AOC10ParteDue {
    public static void main(String[] args){
        final var input = AOC10ParteDue.class.getResourceAsStream("input");
        final List<String> linee = new BufferedReader(new InputStreamReader(input)).lines().toList();

        final int righe = linee.size();
        final int colonne = linee.get(0).length();
        Cell[][] matrix = new Cell[righe][colonne];

        for (int i=0; i < righe; i++){
            for (int j=0; j < colonne; j++){
                matrix[i][j] = new Cell(Character.getNumericValue(linee.get(i).charAt(j)), new Position(i,j));  // ho riempito la matrix di celle
            }
        }

        TopographicMap topographicMap = new TopographicMap(matrix); // creato la mia mappa

        System.out.println(readMatrix(topographicMap));

    }

    public static int readMatrix(TopographicMap topographicMap){
        int cont = 0;
        for (int i=0; i < topographicMap.length; i++){
            for (int j=0; j < topographicMap.width; j++){
                Cell currentCell = topographicMap.getCellAtPosition(i,j).orElseThrow();
                if(currentCell.getNumber() == 0) {
                    List<Cell> visited = new ArrayList<>(); // per memorizzare le celle con il 9 che raggiungo
                    cont += cercaPercorsi(topographicMap, currentCell, visited, 0);
                }
            }
        }
        return cont;
    }

    public static int cercaPercorsi(TopographicMap topographicMap, Cell cell, List<Cell> visited, int num){
        if (cell.getNumber() == 9){
            return 1;
        }
        AtomicInteger percorsi = new AtomicInteger();
        Arrays.stream(Direction.values())
                .map(direction -> topographicMap.getCellAtDirection(cell, direction))
                .filter(optional -> optional.map( c -> topographicMap.contains(c)).orElse(false))
                .forEach(nextCell -> {
                    if ( nextCell.map(Cell::getNumber).map(number -> number == num+1).orElse(false)){
                        percorsi.addAndGet(cercaPercorsi(topographicMap, nextCell.get(), visited, num + 1));
                    }
                });
        return percorsi.get();
    }
}
