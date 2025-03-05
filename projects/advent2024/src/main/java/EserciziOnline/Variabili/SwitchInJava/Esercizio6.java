package EserciziOnline.Variabili.SwitchInJava;

public class Esercizio6 {
    public static void main(String[] args) {
        double pesoPacco = 5;
        double costoSpedizione = calculateCostoSpedizione(pesoPacco);

        System.out.println("Il costo di spedizione per un pacco di peso " + pesoPacco + " kg è di " + costoSpedizione + " euro.");
    }

    public static double calculateCostoSpedizione(double peso) {
        switch ((int) peso) {
            case 1:
                return 5.0;
            case 2:
                return 7.5;
            case 3:
                return 10.0;
            case 4:
                return 12.5;
            default:
                return 15.0;
        }
    }
}
