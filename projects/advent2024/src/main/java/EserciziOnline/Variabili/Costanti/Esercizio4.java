package EserciziOnline.Variabili.Costanti;

public class Esercizio4 {
    private static final double PI = 3.141592635;

    public static double calcolaArea(double raggio) {
        return PI * raggio * raggio;
    }
    public static void main (String[] args) {
        double raggio = 5.0;
        System.out.println(calcolaArea(raggio));
    }
}
