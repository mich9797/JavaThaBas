package EserciziOnline.Variabili.FormattazioneDiStringhe;

public class Esercizio8 {
    public static void main (String[] args) {
     int positivo = +255;
     int negativo = -255;
     String formatopositivo = String.format("Positivo %d", positivo);
     String formatonegativo = String.format("Negativo %d", negativo);
     System.out.println(formatopositivo);
     System.out.println(formatonegativo);

    }
}
