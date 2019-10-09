package org.sorel.problemset.p110;

import org.junit.Assert;
import org.junit.Test;

public class TestPower {
    @Test
    public void test() {
        Power sol = new Power();
        Assert.assertEquals(8.0, sol.power(2, 3), 0.0001);
        Assert.assertEquals(-8.0, sol.power(-2, 3), 0.0001);
        Assert.assertEquals(0.125, sol.power(2, -3), 0.0001);
        Assert.assertEquals(1.0, sol.power(2, 0), 0.0001);
        Assert.assertEquals(1.0, sol.power(0, 0), 0.0001);
        Assert.assertEquals(0.0, sol.power(0, 4), 0.0001);
        Assert.assertEquals(0.0, sol.power(0, -4), 0.0001);
    }
}
