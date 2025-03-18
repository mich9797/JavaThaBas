package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Java_Static_Members.Static_Method_With_Static_Variable;

public class IDGenerator {

    public static int nextID = 1;

    public static int generateID() {
        return nextID++;
    }

    public static void main(String[] args) {

        System.out.println("Generate ID: " + IDGenerator.generateID());
        System.out.println("Generate ID: " + IDGenerator.generateID());
        System.out.println("Generate ID: " + IDGenerator.generateID());
    }
}
