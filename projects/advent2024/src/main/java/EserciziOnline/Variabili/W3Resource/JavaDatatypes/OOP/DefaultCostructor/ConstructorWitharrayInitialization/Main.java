package EserciziOnline.Variabili.W3Resource.JavaDatatypes.OOP.DefaultCostructor.ConstructorWitharrayInitialization;

public class Main {
    public static void main(String[] args) {

        String[] studentArray = {"Andrea","Giacomo","Jhonny"} ;
        Classroom classroom = new Classroom("Religione 134", studentArray);
        classroom.printClasroom();
    }
}
