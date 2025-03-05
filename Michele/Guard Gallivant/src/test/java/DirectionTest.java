import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DirectionTest {
    @Test
    public void shouldReturnNextDirection(){
        var dir = GuardGallivant.Direction.UP;
        assertEquals(GuardGallivant.Direction.RIGHT, GuardGallivant.Direction.getNextCW(dir));
    }
}