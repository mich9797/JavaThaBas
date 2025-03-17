package EserciziOnline.Variabili.Costanti;

public class NanoTime {
    public static void main(String[] args) {
        long startTime , endTime;

            startTime = System.nanoTime();
            String result = "";
            for (int i = 0; i < 10000; i++) result += i;

        endTime = System.nanoTime();
        System.out.println("Time with String: "  + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        StringBuilder sbResult;
        sbResult = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sbResult.append(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time with StringBuilder: " + (endTime - startTime) + " ns");

        }
}

