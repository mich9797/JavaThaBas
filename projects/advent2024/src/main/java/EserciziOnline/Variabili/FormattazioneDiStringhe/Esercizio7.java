package EserciziOnline.Variabili.FormattazioneDiStringhe;

public class Esercizio7 {
    public static void main (String[] args) {
        int numero = 255;
        String formato = String.format("Esadecimale %x", numero);
        System.out.println(formato);
    }
}
