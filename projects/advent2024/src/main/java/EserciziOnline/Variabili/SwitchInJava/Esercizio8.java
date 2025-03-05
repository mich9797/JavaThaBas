package EserciziOnline.Variabili.SwitchInJava;

public class Esercizio8 {
    public static void main(String[] args) {
        int numeroDecimale = 9;
        String[] numeriRomani = {"Numero non valido", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String numeroRomano = (numeroDecimale >= 1 && numeroDecimale <= 10) ? numeriRomani[numeroDecimale] : numeriRomani[0];

        System.out.println("Il numero decimale " + numeroDecimale + " corrisponde al numero romano " + numeroRomano + ".");
    }
}
