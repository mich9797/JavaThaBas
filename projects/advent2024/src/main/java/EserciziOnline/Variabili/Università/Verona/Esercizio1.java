package EserciziOnline.Variabili.Università.Verona;

public class Esercizio1 {
    public static void main (String[] args) {
        int n;

        if (args.length == 0) {
            System.out.println("Occorre passare un valore come argomento all'avvio.");

        } else {
            n = Integer.parseInt(args[0]);
            int i;
            for (i = 0; i < n; i++) ;
            int j;
            for (j = 0; j < n; j++) ;
            System.out.println(i * j % n);
            System.out.println();
        }
    }
}
