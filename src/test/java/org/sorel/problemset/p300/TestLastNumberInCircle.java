package org.sorel.problemset.p300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLastNumberInCircle {
    @Test
    public void test() {
        LastNumberInCircle sol = new LastNumberInCircle();
        Assertions.assertEquals(3, sol.lastRemaining(5, 3));
        Assertions.assertEquals(2, sol.lastRemaining(5, 2));
        Assertions.assertEquals(4, sol.lastRemaining(6, 7));
        Assertions.assertEquals(3, sol.lastRemaining(6, 6));
        Assertions.assertEquals(-1, sol.lastRemaining(0, 0));
        Assertions.assertEquals(1027, sol.lastRemaining(4000, 997));
    }
}
