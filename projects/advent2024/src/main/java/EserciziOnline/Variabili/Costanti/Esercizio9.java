package EserciziOnline.Variabili.Costanti;

public class Esercizio9 {
    public static final int MAX_UTENTI = 100;
    public static final String VERSIONE = "1.0";

    public static void  stampaInfo() {
        System.out.println("Versione : " + VERSIONE);
        System.out.println("Numero massimo utenti : " + MAX_UTENTI);
    }
    public static void main (String[] args) {
        stampaInfo();
    }

}
