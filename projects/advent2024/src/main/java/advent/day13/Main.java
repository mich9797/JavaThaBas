package advent.day13;

import advent.day10.Position;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public  static void main (String[] args) {
        var input = advent.day12.Main.class.getResourceAsStream("input.txt");
        List<String> file = new BufferedReader(new InputStreamReader(input)).lines().toList();

        int righe = file.size();
        int colonne = file.get(0).length();
        Cella[][] matrix = new Cella[righe][colonne];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrix[i][j] = new Cella(file.get(i).charAt(j), new Bottone(i, j));
            }
        }


        returnSUm();
    }


    static void returnSUm() {


    }
    static void Calcolo (int righe, int colonne, Bottone position) {

    }
}
