package EserciziOnline.Variabili.W3Resource.JavaDatatypes.Java_Static_Members.Static_Block_For_Initializatio;

public class Configuration {

    public static String confiValue;

    static {
        confiValue = "Default config Value";
        System.out.println("Static block executed: configValue initialized");
    }

    public static void main(String[] args) {

        System.out.println("Config Value: " + confiValue);
    }
}
