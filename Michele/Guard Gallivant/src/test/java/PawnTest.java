import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PawnTest {

    @Test
    public void shouldReturnPawnMovedUp() {
        GuardGallivant.Pawn pawn = new GuardGallivant.Pawn();
        pawn.setX(5);
        pawn.setY(5);

        pawn.move(GuardGallivant.Direction.UP);

        assertEquals(4, pawn.getX());
        assertEquals(5, pawn.getY());
    }
}