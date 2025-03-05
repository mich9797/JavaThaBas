package EserciziOnline.Variabili.SwitchInJava;

public class Esercizio3 {
    public static void main (String[] args) {
        int numeroMese = 2;
        int numeroGiorni;

        switch (numeroMese) {
            case 1:
                numeroGiorni = 31;
                break;
            case 2:
                numeroGiorni = 28;
                break;
            case 3:
                numeroGiorni = 31;
                break;
            case 4:
                numeroGiorni = 30;
                break;
            case 5:
                numeroGiorni = 31;
                break;
            case 6:
                numeroGiorni = 30;
                break;
            case 7:
                numeroGiorni = 31;
                break;
            case 8:
                numeroGiorni = 31;
                break;
            case 9:
                numeroGiorni = 30;
                break;
            case 10:
                numeroGiorni = 31;
                break;
            case 11:
                numeroGiorni = 30;
                break;
            case 12:
                numeroGiorni = 31;
                break;
            default:
                numeroGiorni = -1;
        }

        System.out.println("Il mese " + numeroMese + " ha " + numeroGiorni + " giorni.");
    }
}
