package EserciziOnline.Variabili.Costanti;


public class Esercizio5 implements Costanti {
    public static void main (String[] args) {
        System.out.println("Lunghezza massima : " + LUNGHEZZA_MASSIMA);
        System.out.println(MESSAGGIO_DI_BENVENUTO);
    }
}

interface Costanti {
    int LUNGHEZZA_MASSIMA = 100;
    String MESSAGGIO_DI_BENVENUTO = "Ciao mondo!";
}