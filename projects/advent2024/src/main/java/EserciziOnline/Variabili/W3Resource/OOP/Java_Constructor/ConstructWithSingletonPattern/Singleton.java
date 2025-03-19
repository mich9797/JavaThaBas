package EserciziOnline.Variabili.W3Resource.OOP.Java_Constructor.ConstructWithSingletonPattern;

public class Singleton {

    static Singleton singleInstance = null;

    private Singleton() {
        System.out.println("Singletone istance created.");

    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
