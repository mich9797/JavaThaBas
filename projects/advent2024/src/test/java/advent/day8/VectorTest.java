package advent.day8;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {
    @Test
    public void testEquals() {
        var a = new Vector(1,2);
        var b = new Vector(1,2);
        Assert.assertEquals(a, b);
    }
}
