import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AOC14 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        final var input = AOC14.class.getResourceAsStream("input");
        final int[] quadrants = new BufferedReader(new InputStreamReader(input)).lines()
                .mapToInt(riga -> {
                    Pattern pattern = Pattern.compile("(-?\\d+)");
                    Matcher matcher = pattern.matcher(riga);
                    List<Integer> nums = new ArrayList<>();
                    while(matcher.find()){
                        nums.add(Integer.parseInt(matcher.group()));
                    }
                    Robot rb = new Robot(new Coordinates(nums.get(0), nums.get(1)), new Coordinates(nums.get(2), nums.get(3)));
                    int q = rb.getCoordinates().moveAtQuadrant(rb.getSpeed(), matrix.getLength(), matrix.getWidth());
                    return q;
                })
                .filter(q -> q < 4)
                .toArray();

        
        int[] quad = new int[4];
        for (int num : quadrants){
                quad[num] += 1;
        }
        System.out.println(quad[0] * quad[1] * quad[2] * quad[3]);
    }
}
