package advent.day5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.newInputStream;

public class AdventOfCode5 {
    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "/home/gbasello/projects/advent2024/src/main/java/advent/day5/input5.txt";
        Path filePath = Path.of(fileName);


        if (!Files.exists(filePath)) {
            System.err.println("Error: The file '" + fileName + "' does not exist. Please ensure the file is in the correct directory.");
            return;
        }

        try (var src = new BufferedReader(new InputStreamReader(newInputStream(filePath)))) {


            List<List<Integer>> regole = new ArrayList<>();
            List<Integer> daSommare = new ArrayList<>();

            src.lines()
                    .forEach(riga -> {
                        if (!(riga == null || riga.isBlank()) && riga.length() == 5) {
                            List<Integer> coppia = leggiCoppie(riga);
                            if (coppia != null) {
                                regole.add(coppia);
                            }
                        } else if (!(riga == null || riga.isBlank())) {

                            List<Integer> seqNum = parseSequenza(riga);


                            boolean isCorretto = validazioneSequenza(seqNum, regole);


                            if (isCorretto) {
                                daSommare.add(valoreDimezzo(seqNum));
                            }
                        }
                    });


            int somma = daSommare.stream().mapToInt(Integer::intValue).sum();
            System.out.println(somma);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static List<Integer> leggiCoppie(String riga) {
        try {
            String[] tokens = riga.split("\\|");
            if (tokens.length == 2) {
                return Arrays.stream(tokens)
                        .map(Integer::parseInt)
                        .toList();
            }
        } catch (NumberFormatException e) {
            System.err.println("Errore nel parsing della riga: " + riga);
        }
        return null;
    }


    public static int valoreDimezzo(List<Integer> rigaSequenza) {
        int posizione = rigaSequenza.size() / 2;
        return rigaSequenza.get(posizione);
    }


    public static boolean validazioneSequenza(List<Integer> seqNum, List<List<Integer>> regole) {
        for (int i = 0; i < seqNum.size() - 1; i++) {
            int n1 = seqNum.get(i);
            int n2 = seqNum.get(i + 1);
            for (List<Integer> coppia : regole) {
                if (coppia.get(0).equals(n2) && coppia.get(1).equals(n1)) {

                    seqNum.set(i, n2);
                    seqNum.set(i + 1, n1);
                    return false;
                }
            }
        }
        return true;
    }


    public static List<Integer> parseSequenza(String sequenza) {
        List<Integer> seqNum = new ArrayList<>();
        String[] numeri = sequenza.split(",");
        for (String num : numeri) {
            try {
                seqNum.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                System.err.println("Errore nel parsing del numero: " + num);
            }
        }
        return seqNum;
    }
}