import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AOC14 {

    public static final int LENGTH = 101;
    public static final int WIDTH = 103;

    public static void main(String[] args) {
         final var input = AOC14.class.getResourceAsStream("input");
//        final var input = new ByteArrayInputStream(new byte[]{});
        final var countByQuadrant = new BufferedReader(new InputStreamReader(input)).lines()
                .map(riga -> {
                    Pattern pattern = Pattern.compile("(-?\\d+)");
                    Matcher matcher = pattern.matcher(riga);
                    List<Integer> nums = new ArrayList<>();
                    while (matcher.find()) {
                        nums.add(Integer.parseInt(matcher.group()));
                    }
                    Robot rb = new Robot(new Coordinates(nums.get(0), nums.get(1)), new Coordinates(nums.get(2), nums.get(3)));
                    var coords = rb.getCoordinates().add(rb.getSpeed().scalarMul(100)).modulus(LENGTH, WIDTH);
                    return coords.quadrant(LENGTH, WIDTH);
                })
                .flatMap(Optional::stream)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        var product = countByQuadrant.values().stream()
                .reduce((l, r) -> l*r)
                .orElse(0L);
        System.out.println(product);

    }
}
