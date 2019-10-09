package org.sorel.problemset.p249;

import org.junit.Assert;
import org.junit.Test;

public class TestInversePairs {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
        test08();
    }

    @Test
    public void test01() {
        InversePairs sol = new InversePairs();
        int[] arr = {1, 2, 3, 4, 7, 6, 5};
        Assert.assertEquals(3, sol.inversePairs(arr));
    }

    @Test
    public void test02() {
        InversePairs sol = new InversePairs();
        int[] arr = {6, 5, 4, 3, 2, 1};
        Assert.assertEquals(15, sol.inversePairs(arr));
    }

    @Test
    public void test03() {
        InversePairs sol = new InversePairs();
        int[] arr = {1, 2, 3, 4, 5, 6};
        Assert.assertEquals(0, sol.inversePairs(arr));
    }

    @Test
    public void test04() {
        InversePairs sol = new InversePairs();
        int[] arr = {1};
        Assert.assertEquals(0, sol.inversePairs(arr));
    }

    @Test
    public void test05() {
        InversePairs sol = new InversePairs();
        int[] arr = {1, 2};
        Assert.assertEquals(0, sol.inversePairs(arr));
    }

    @Test
    public void test06() {
        InversePairs sol = new InversePairs();
        int[] arr = {2, 1};
        Assert.assertEquals(1, sol.inversePairs(arr));
    }

    @Test
    public void test07() {
        InversePairs sol = new InversePairs();
        int[] arr = {1, 2, 1, 2, 1};
        Assert.assertEquals(3, sol.inversePairs(arr));
    }

    @Test
    public void test08() {
        InversePairs sol = new InversePairs();
        int[] arr = null;
        Assert.assertEquals(0, sol.inversePairs(arr));
    }
}
