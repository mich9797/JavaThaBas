

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDirectionChecker {

    @Test
    public void shouldReturnExitIfDirectionBringsOutOfMatrix() {
        final var matrix = new char[1][1];
        final var x = new char['.'];
        matrix[0] = x;
        final var sut = new GuardGallivant.DirectionChecker('a', 'a');
        assertEquals(GuardGallivant.Move.EXIT, sut.tryDirection(GuardGallivant.Direction.UP, 0, 0, matrix));
    }

}