package EserciziOnline.Variabili.Costanti;

public class Esercizio10 {
    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 8080;

    private String host;
    private int port;

    public Esercizio10() {
        this.host = DEFAULT_HOST;
        this.port = DEFAULT_PORT;
    }

    public void stampaConfigurazione() {
        System.out.println("Host: " + this.host + " Porta: " + this.port);
    }
    public static void main (String[] args) {
        Esercizio10 configurazione = new Esercizio10();
        configurazione.stampaConfigurazione();
    }
}
