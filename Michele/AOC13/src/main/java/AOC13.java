import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AOC13 {
    public static void main(String[] args) throws IOException {
        final var input = AOC13.class.getResourceAsStream("input");

//        String ciao = Files.readAllLines(Paths.get("/home/mtha/Basello/JavaThaBas/Michele/AOC13/src/main/resources/input")).toString();
//        int tot2 = generaClawMachines(ciao).stream().mapToInt(ClawMachine::play).sum();

        String testo = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining());
        int tot2 = generaClawMachines(testo).stream().mapToInt(ClawMachine::play).sum();


//        final List<int[]> coppieNumeri = new BufferedReader(new InputStreamReader(input)).lines()
//                .filter(riga -> !riga.isEmpty())
//                .map(riga -> {
//                    Pattern pattern = Pattern.compile("X[+=](\\d+), Y[+=](\\d+)");
//                    Matcher matcher = pattern.matcher(riga);
//                    int[] xy = new int[2];
//                    if(matcher.find()){
//                            xy[0] = Integer.parseInt(matcher.group(1));
//                            xy[1] = Integer.parseInt(matcher.group(2));
//                    }
//                    return xy;
//                }).toList();
//
//        int tot = generaClawMachines(coppieNumeri).stream().mapToInt(ClawMachine::play).sum();

//        System.out.println(tot);
        System.out.println(tot2);
    }
//
//    public static List<ClawMachine> generaClawMachines(List<int[]> lista){
//        List<ClawMachine> clawMachinesList = new ArrayList<>();
//        for (int i=0; i < lista.size(); i = i+3){
//
//            ClawMachine clawMachine = new ClawMachine(new Button(new Coordinates(lista.get(i)[0], lista.get(i)[1])),
//                    new Button(new Coordinates(lista.get(i+1)[0], lista.get(i+1)[1])), new Coordinates(lista.get(i+2)[0], lista.get(i+2)[1]));
//
//            clawMachinesList.add(clawMachine);
//        }
//        return clawMachinesList;
//    }

    public static List<ClawMachine> generaClawMachines(String stringa){
        Pattern pat = Pattern.compile("\\d+");
        Matcher match = pat.matcher(stringa);
        int cont = 0;
        List<Integer> nums = new ArrayList<>();
        List<ClawMachine> clawMachines = new ArrayList<>();
        while(match.find()){
            nums.add(Integer.parseInt(match.group()));
            cont++;
            if (cont == 6){
                clawMachines.add(new ClawMachine(new Button(new Coordinates(nums.get(0), nums.get(1))),
                        new Button(new Coordinates(nums.get(2), nums.get(3))), new Coordinates(nums.get(4), nums.get(5))));
                cont = 0;
                nums.clear();
            }
        }
        return clawMachines;
    }
}
