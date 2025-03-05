package EserciziOnline.Variabili.SwitchInJava;

public class Esercizio1 {
    public static void main (String[] args) {
        int numeroGiorno = 8;
        String nomeGiorno;

        switch (numeroGiorno) {
            case 1:
                nomeGiorno = "Lunedì";
                break;
            case 2:
                nomeGiorno = "Martedì";
                break;
            case 3:
                nomeGiorno = "Mercoledì";
                break;
            case 4:
                nomeGiorno = "Giovedì";
                break;
            case 5:
                nomeGiorno = "Venerdì";
                break;
            case 6:
                nomeGiorno = "Sabato";
                break;
            case 7:
                nomeGiorno = "Domenica";
                break;
            default:
                nomeGiorno = "Numero non valido";


        }
        System.out.println("Il numero " + numeroGiorno + " corrisponde al giorno " + nomeGiorno + "");
    }
}
