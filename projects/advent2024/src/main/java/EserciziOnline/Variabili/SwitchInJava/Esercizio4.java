package EserciziOnline.Variabili.SwitchInJava;

public class Esercizio4 {
    public static void main (String[] args) {
        int numeroMese = 6;
        String stagione;

        switch (numeroMese) {
            case 12:
            case 1:
            case 2:
                stagione = "Inverno";
                break;
            case 3:
            case 4:
            case 5:
                stagione = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                stagione = "Estate";
                break;
            case 9:
            case 10:
            case 11:
                stagione = "Autunno";
                break;
            default:
                stagione = "Numero non valido";
        }

        System.out.println("Il mese " + numeroMese + " corrisponde alla stagione " + stagione + ".");
    }
}
