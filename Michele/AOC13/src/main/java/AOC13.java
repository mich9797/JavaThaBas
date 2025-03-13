import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AOC13 {
    public static void main(String[] args){
        final var input = AOC13.class.getResourceAsStream("input");
        final List<int[]> coppieNumeri = new BufferedReader(new InputStreamReader(input)).lines()
                .filter(riga -> !riga.isEmpty())
                .map(riga -> {
                    Pattern pattern = Pattern.compile("X\\+(\\d+), Y\\+(\\d+)|X=(\\d+), Y=(\\d+)");
                    Matcher matcher = pattern.matcher(riga);
                    int[] xy = new int[2];
                    if(matcher.find()){
                        if(matcher.group(3) == null){
                            xy[0] = Integer.parseInt(matcher.group(1));
                            xy[1] = Integer.parseInt(matcher.group(2));
                        }else{
                            xy[0] = Integer.parseInt(matcher.group(3));
                            xy[1] = Integer.parseInt(matcher.group(4));
                        }
                    }
                    return xy;
                }).toList();

        List<ClawMachine> clawMachinesList = generaClawMachines(coppieNumeri);

        int tot = clawMachinesList.stream().mapToInt(claw -> playClaeMachine(claw)).sum();
        System.out.println(tot);
    }

    public static int playClaeMachine(ClawMachine clawMachine){
        do {
            clawMachine.resetClaw();
            while (clawMachine.getB().getCont() < clawMachine.getB().getMax()) {
                clawMachine.moveClaw(clawMachine.getB());
                clawMachine.getB().incrCont();
            }
            while (clawMachine.getClaw().getX() < clawMachine.getPrize().getX() && clawMachine.getA().getCont() < clawMachine.getA().getMax()) {
                clawMachine.moveClaw(clawMachine.getA());
                clawMachine.getA().incrCont();
            }
            if (clawMachine.getClaw().getX() == clawMachine.getPrize().getX() && clawMachine.getClaw().getY() == clawMachine.getPrize().getY()){
                return (clawMachine.getB().getCont())+(clawMachine.getA().getCont()*3);
            }
            clawMachine.getB().reduceMax();
            clawMachine.getB().resetCont();
            clawMachine.getA().resetCont();
        } while(clawMachine.getB().getMax() > 0);
        return 0;
    }

    public static List<ClawMachine> generaClawMachines(List<int[]> lista){
        List<ClawMachine> clawMachinesList = new ArrayList<>();
        for (int i=0; i < lista.size(); i = i+3){
            ClawMachine clawMachine = new ClawMachine(new Button(new Coordinates(lista.get(i)[0], lista.get(i)[1])), new Button(new Coordinates(lista.get(i+1)[0], lista.get(i+1)[1])), new Coordinates(lista.get(i+2)[0], lista.get(i+2)[1]));
            clawMachinesList.add(clawMachine);
        }
        return clawMachinesList;
    }
}
