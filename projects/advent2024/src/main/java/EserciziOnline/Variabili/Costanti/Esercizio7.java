package EserciziOnline.Variabili.Costanti;

public class Esercizio7 {
    public static void main (String[] args) {
        System.out.println(CostantUtil.URL);
        System.out.println(CostantUtil.TIMEOUT);
    }
}

class CostantUtil {
    public static final String URL = "https://www.google.com";
    public static final int TIMEOUT = 1000;
}
