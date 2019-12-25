package org.sorel.problemset.p096;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCuttingRope {
    @Test
    public void test() {
        CuttingRope sol = new CuttingRope();
        int len = 0;
        Assertions.assertEquals(0, sol.maxProduct(len));

        len = 1;
        Assertions.assertEquals(0, sol.maxProduct(len));

        len = 2;
        Assertions.assertEquals(1, sol.maxProduct(len));

        len = 3;
        Assertions.assertEquals(2, sol.maxProduct(len));

        len = 4;
        Assertions.assertEquals(4, sol.maxProduct(len));

        len = 5;
        Assertions.assertEquals(6, sol.maxProduct(len));

        len = 6;
        Assertions.assertEquals(9, sol.maxProduct(len));

        len = 7;
        Assertions.assertEquals(12, sol.maxProduct(len));

        len = 8;
        Assertions.assertEquals(18, sol.maxProduct(len));

        len = 9;
        Assertions.assertEquals(27, sol.maxProduct(len));

        len = 10;
        Assertions.assertEquals(36, sol.maxProduct(len));

        len = 50;
        Assertions.assertEquals(86093442, sol.maxProduct(len));
    }
}
