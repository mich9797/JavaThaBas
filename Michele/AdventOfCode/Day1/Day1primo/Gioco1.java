package Michele.AdventOfCode.Day1.Day1primo;

import java.util.Collections;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Gioco1{
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get("input.txt"));
            for (String line : lines){

                String[] valori = line.split("   ");

                int a = Integer.parseInt(valori[0]);
                lista1.add(a);

                int b = Integer.parseInt(valori[1]);
                lista2.add(b);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(lista1);   
        Collections.sort(lista2);
        
        int tot = 0;
        int cont = 0;
        while (cont < lista1.size()){
            int a = lista1.get(cont);
            int b = lista2.get(cont);
            tot = tot + Math.abs(a-b);
            cont++;
        }

        System.out.println(tot);
    }
}