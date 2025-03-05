package EserciziOnline.Variabili.Costanti;

public class Esercizio6 {
    public static void main (String[] args) {
        Giorno oggi = Giorno.MERCOLEDI;
        System.out.println("Oggi è : " + oggi);
    }
}

enum Giorno {
    LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO
}
