package org.sorel.problemset.p240;

import org.junit.Assert;
import org.junit.Test;

public class TestUglyNumber {
    @Test
    public void test() {
        UglyNumber sol = new UglyNumber();
        Assert.assertEquals(1, sol.getUglyNumber(1));
        Assert.assertEquals(2, sol.getUglyNumber(2));
        Assert.assertEquals(3, sol.getUglyNumber(3));
        Assert.assertEquals(4, sol.getUglyNumber(4));
        Assert.assertEquals(5, sol.getUglyNumber(5));
        Assert.assertEquals(6, sol.getUglyNumber(6));
        Assert.assertEquals(8, sol.getUglyNumber(7));
        Assert.assertEquals(9, sol.getUglyNumber(8));
        Assert.assertEquals(10, sol.getUglyNumber(9));
        Assert.assertEquals(12, sol.getUglyNumber(10));
        Assert.assertEquals(15, sol.getUglyNumber(11));
        Assert.assertEquals(859963392, sol.getUglyNumber(1500));
    }
}
