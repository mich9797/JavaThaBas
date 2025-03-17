package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.ConstructWithSingletonPattern;

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
