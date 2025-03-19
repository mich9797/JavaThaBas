package EserciziOnline.Variabili.W3Resource.OOP.Java_Static_Members.Static_Block;

public class Main {
    public static void main(String[] args) {

        System.out.println("Before creating an istance: initialVariable = " + Initializer.initialVariable);

        Initializer initializer = new Initializer();
        System.out.println("After creating an instance: initialVariable = " + Initializer.initialVariable);
    }
}
