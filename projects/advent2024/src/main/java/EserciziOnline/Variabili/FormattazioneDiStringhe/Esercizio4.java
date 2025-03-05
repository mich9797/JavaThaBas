package EserciziOnline.Variabili.FormattazioneDiStringhe;

public class Esercizio4 {
    public static void main (String[] args) {
        String testo = "Java";
        String formatoSinistra = String.format("%-10s", testo);
        String formatoDestra = String.format("%10s", testo);
        System.out.println("Allineamento a sinistra: [" + formatoSinistra + "]");
        System.out.println("Allineamento a destra: [" + formatoDestra + "]");
    }
}
