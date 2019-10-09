package org.sorel.problemset.p307;

import org.junit.Assert;
import org.junit.Test;

public class TestAccumulate {
    @Test
    public void test() {
        Accumulate sol = new Accumulate();
        Assert.assertEquals(1, sol.getSum(1));
        Assert.assertEquals(15, sol.getSum(5));
        Assert.assertEquals(55, sol.getSum(10));
        Assert.assertEquals(0, sol.getSum(0));
    }
}
