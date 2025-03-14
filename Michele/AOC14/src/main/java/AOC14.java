import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AOC14 {
    public static void main(String[] args) {
        final var input = AOC14.class.getResourceAsStream("input");
        final List<Robot> robots = new BufferedReader(new InputStreamReader(input)).lines()
                .map(riga -> {
                    Pattern pattern = Pattern.compile("(\\d+|-\\d+)");
                    Matcher matcher = pattern.matcher(riga);
                    List<Integer> numbers = new ArrayList<>();
                    while (matcher.find()){
                        numbers.add(Integer.parseInt(matcher.group()));
                    }
                    return numbers;
                })
                .map(nums -> {
                    Robot robot = new Robot(new Coordinates(nums.get(1), nums.get(0)), new Coordinates(nums.get(3), nums.get(2)));
                    return robot;
                })
                .toList();

        int[][] matrix = new int[103][101]; // dimensioni date dall'esercizio

        robots.stream()
                .forEach(robot -> {
                    for (int i=0; i <100; i++){
                        robot.move();
                        robot.getCoordinates().checkCoordinates(matrix);
                    }
                    matrix[robot.getCoordinates().getX()][robot.getCoordinates().getY()] += 1;
                });

        System.out.println(contTotQuadrants(matrix));
    }

    public static int contTotQuadrants(int[][] matrix){
        int halfY = matrix.length / 2;
        int halfX = matrix[0].length / 2;
        int[] cont = new int[4];
        int tot = 1;

        for(int reps=0; reps < 4; reps++){
            int contQ = 0;
            switch(reps){
                case 0:
                    for(int i=0; i < halfY; i++){
                        for(int j=0; j < halfX; j++){
                            contQ += matrix[i][j];
                        }
                    }
                    cont[reps] = contQ;
                    break;
                case 1:
                    for(int i=0; i < halfY; i++){
                        for(int j=halfX+1; j < matrix[0].length; j++){
                            contQ += matrix[i][j];
                        }
                    }
                    cont[reps] = contQ;
                    break;
                case 2:
                    for(int i=halfY+1; i < matrix.length; i++){
                        for(int j=0; j < halfX; j++){
                            contQ += matrix[i][j];
                        }
                    }
                    cont[reps] = contQ;
                    break;
                default:
                    for(int i=halfY+1; i < matrix.length; i++){
                        for(int j=halfX+1; j < matrix[0].length; j++){
                            contQ += matrix[i][j];
                        }
                    }
                    cont[reps] = contQ;
            }
        }
        for(int n : cont){
            tot *= n;
        }
        return tot;
    }
}
