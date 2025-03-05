package EserciziOnline.Variabili.FormattazioneDiStringhe;

public class Esercizio1 {
    public static void main (String[] args) {
        int eta = 25;
        String nome = "Alice";
        String memessaggio = String.format("Nome: %s, Età %d", nome, eta);
        System.out.println(memessaggio);
    }
}
