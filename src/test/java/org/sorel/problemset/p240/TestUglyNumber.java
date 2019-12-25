package org.sorel.problemset.p240;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUglyNumber {
    @Test
    public void test() {
        UglyNumber sol = new UglyNumber();
        Assertions.assertEquals(1, sol.getUglyNumber(1));
        Assertions.assertEquals(2, sol.getUglyNumber(2));
        Assertions.assertEquals(3, sol.getUglyNumber(3));
        Assertions.assertEquals(4, sol.getUglyNumber(4));
        Assertions.assertEquals(5, sol.getUglyNumber(5));
        Assertions.assertEquals(6, sol.getUglyNumber(6));
        Assertions.assertEquals(8, sol.getUglyNumber(7));
        Assertions.assertEquals(9, sol.getUglyNumber(8));
        Assertions.assertEquals(10, sol.getUglyNumber(9));
        Assertions.assertEquals(12, sol.getUglyNumber(10));
        Assertions.assertEquals(15, sol.getUglyNumber(11));
        Assertions.assertEquals(859963392, sol.getUglyNumber(1500));
    }
}
