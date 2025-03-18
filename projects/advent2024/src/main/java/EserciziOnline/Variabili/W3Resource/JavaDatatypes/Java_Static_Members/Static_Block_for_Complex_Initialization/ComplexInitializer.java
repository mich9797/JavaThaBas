package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Java_Static_Members.Static_Block_for_Complex_Initialization;

public class ComplexInitializer {

        private static int x;
        private static int y;
        private static int z;

        static {
            x = 10;
            y = 9;
            z = calculateZ(x,y);
        }

        private static int calculateZ(int a, int b) {
            return a * b + (a - b);
        }

    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
