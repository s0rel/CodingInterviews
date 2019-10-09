package org.sorel.problemset.p310;

import org.junit.Assert;
import org.junit.Test;

public class TestAddTwoNumbers {
    @Test
    public void test01() {
        AddTwoNumbers sol = new AddTwoNumbers();
        Assert.assertEquals(3, sol.add(1, 2));
        Assert.assertEquals(1010, sol.add(111, 899));
        Assert.assertEquals(1, sol.add(-1, 2));
        Assert.assertEquals(-1, sol.add(1, -2));
        Assert.assertEquals(3, sol.add(3, 0));
        Assert.assertEquals(-4, sol.add(0, -4));
        Assert.assertEquals(-10, sol.add(-2, -8));
    }
}
