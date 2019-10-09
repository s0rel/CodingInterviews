package org.sorel.problemset.p225;

import org.junit.Assert;
import org.junit.Test;

public class TestDigitsInSequence {
    @Test
    public void test() {
        DigitsInSequence sol = new DigitsInSequence();
        Assert.assertEquals(0, sol.digitAtIndex(0));
        Assert.assertEquals(1, sol.digitAtIndex(1));
        Assert.assertEquals(9, sol.digitAtIndex(9));
        Assert.assertEquals(1, sol.digitAtIndex(10));
        Assert.assertEquals(9, sol.digitAtIndex(189));
        Assert.assertEquals(1, sol.digitAtIndex(190));
        Assert.assertEquals(3, sol.digitAtIndex(1000));
        Assert.assertEquals(7, sol.digitAtIndex(1001));
        Assert.assertEquals(0, sol.digitAtIndex(1002));
    }
}
