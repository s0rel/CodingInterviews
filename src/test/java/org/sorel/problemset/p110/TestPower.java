package org.sorel.problemset.p110;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPower {
    @Test
    public void test() {
        Power sol = new Power();
        Assertions.assertEquals(8.0, sol.power(2, 3), 0.0001);
        Assertions.assertEquals(-8.0, sol.power(-2, 3), 0.0001);
        Assertions.assertEquals(0.125, sol.power(2, -3), 0.0001);
        Assertions.assertEquals(1.0, sol.power(2, 0), 0.0001);
        Assertions.assertEquals(1.0, sol.power(0, 0), 0.0001);
        Assertions.assertEquals(0.0, sol.power(0, 4), 0.0001);
        Assertions.assertEquals(0.0, sol.power(0, -4), 0.0001);
    }
}
