package advent.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var input = advent.day8.Main.class.getResourceAsStream("input.txt");
        if(input == null){
            throw new IllegalArgumentException("Input file not found");
        }
        final List<String> lines = new BufferedReader(new InputStreamReader(input)).lines().toList();
        char[][] grid = lines.stream().map(String::toCharArray).toArray(char[][]::new);
        Map<Character, List<int[]>> antennas = trovaAntenne.trovaAntenne(grid);
        int result = trovaAntinodi.trovaAntinodes(antennas, grid.length, grid[0].length);
        System.out.println(result);
    }

}

