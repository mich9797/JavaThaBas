package advent.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var input = advent.day9.Main.class.getResourceAsStream("input");
        final List<String> linee = new BufferedReader(new InputStreamReader(input)).lines().toList();

        int righe = linee.size();
        var colonne = java.lang.Integer.parseInt(linee.get(0));
        int [][] matrix = new int[righe][colonne];
    }


    public static int moveOnMatrix (int [][] matrix) {
        int conta = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                List<Position> lista = new ArrayList<>();
                conta += methodA(matrix, new Position(i,j), 0, Direzione.UP, lista);

            }

        }

        return conta;
    }

    public static int methodA (int[][] matrix, Position position, int i, Direzione up, List<Position> lista) {

        return 0;
    }
}






