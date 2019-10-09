package org.sorel.problemset.p100;

import org.junit.Assert;
import org.junit.Test;

public class TestNumberOf1InBinary {
    @Test
    public void test() {
        NumberOf1InBinary sol = new NumberOf1InBinary();
        Assert.assertEquals(0, sol.numberOfOne(0));
        Assert.assertEquals(1, sol.numberOfOne(1));
        Assert.assertEquals(2, sol.numberOfOne(10));
        Assert.assertEquals(31, sol.numberOfOne(0x7FFFFFFF));
        Assert.assertEquals(32, sol.numberOfOne(0xFFFFFFFF));
        Assert.assertEquals(1, sol.numberOfOne(0x80000000));
    }
}
