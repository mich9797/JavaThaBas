package EserciziOnline.Variabili.W3Resource.OOP.Java_Constructor.ConstructWithSingletonPattern;

public class Main {
    public static void main(String[] args) {

        Singleton istance1 = Singleton.getInstance();
        Singleton istance2 = Singleton.getInstance();

        if (istance1 == istance2) {
            System.out.println("Both istane are the same.");
        } else {
            System.out.println("Istances are different.");
        }
    }
}
