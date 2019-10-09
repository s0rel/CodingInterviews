package org.sorel.problemset.p096;

import org.junit.Assert;
import org.junit.Test;

public class TestCuttingRope {
    @Test
    public void test() {
        CuttingRope sol = new CuttingRope();
        int len = 0;
        Assert.assertEquals(0, sol.maxProduct(len));

        len = 1;
        Assert.assertEquals(0, sol.maxProduct(len));

        len = 2;
        Assert.assertEquals(1, sol.maxProduct(len));

        len = 3;
        Assert.assertEquals(2, sol.maxProduct(len));

        len = 4;
        Assert.assertEquals(4, sol.maxProduct(len));

        len = 5;
        Assert.assertEquals(6, sol.maxProduct(len));

        len = 6;
        Assert.assertEquals(9, sol.maxProduct(len));

        len = 7;
        Assert.assertEquals(12, sol.maxProduct(len));

        len = 8;
        Assert.assertEquals(18, sol.maxProduct(len));

        len = 9;
        Assert.assertEquals(27, sol.maxProduct(len));

        len = 10;
        Assert.assertEquals(36, sol.maxProduct(len));

        len = 50;
        Assert.assertEquals(86093442, sol.maxProduct(len));
    }
}
