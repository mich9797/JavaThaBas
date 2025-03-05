package EserciziOnline.Variabili.FormattazioneDiStringhe;

public class Esercizio2 {
    public static void main (String[] args) {
        double numero = 1234.5678;
        String formato = String.format("%.2f", numero);
        System.out.println(formato);

    }
}
