package EserciziOnline.Variabili.W3Resource.JavaDatatypes;

public class CompareSignedAndUnsignedNumbers {
    public static void main(String[] args) {

        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;
        System.out.println("Signed integers: " + in1 + " " + in2);
        System.out.println("_________________________________________________");
        int compare_Signed_num = Integer.compare(in1,in2);
        System.out.println("Result of compare signed numbers: " + compare_Signed_num);
        int compare_Unsigned_mum = Integer.compareUnsigned(in1,in2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_mum);
    }

}
