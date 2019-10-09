package org.sorel.problemset.p300;

import org.junit.Assert;
import org.junit.Test;

public class TestLastNumberInCircle {
    @Test
    public void test() {
        LastNumberInCircle sol = new LastNumberInCircle();
        Assert.assertEquals(3, sol.lastRemaining(5, 3));
        Assert.assertEquals(2, sol.lastRemaining(5, 2));
        Assert.assertEquals(4, sol.lastRemaining(6, 7));
        Assert.assertEquals(3, sol.lastRemaining(6, 6));
        Assert.assertEquals(-1, sol.lastRemaining(0, 0));
        Assert.assertEquals(1027, sol.lastRemaining(4000, 997));
    }
}
