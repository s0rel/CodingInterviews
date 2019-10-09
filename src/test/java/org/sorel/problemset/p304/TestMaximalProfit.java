package org.sorel.problemset.p304;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximalProfit {
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
        MaximalProfit sol = new MaximalProfit();
        int[] arr = {4, 1, 3, 2, 5};
        Assert.assertEquals(4, sol.maximalProfit(arr));
    }

    @Test
    public void test02() {
        MaximalProfit sol = new MaximalProfit();
        int[] arr = {1, 2, 4, 7, 11, 16};
        Assert.assertEquals(15, sol.maximalProfit(arr));
    }

    @Test
    public void test03() {
        MaximalProfit sol = new MaximalProfit();
        int[] arr = {16, 11, 7, 4, 2, 1};
        Assert.assertEquals(-1, sol.maximalProfit(arr));
    }

    @Test
    public void test04() {
        MaximalProfit sol = new MaximalProfit();
        int[] arr = {16, 16, 16, 16, 16};
        Assert.assertEquals(0, sol.maximalProfit(arr));
    }

    @Test
    public void test05() {
        MaximalProfit sol = new MaximalProfit();
        int[] arr = {9, 11, 5, 7, 16, 1, 4, 2};
        Assert.assertEquals(11, sol.maximalProfit(arr));
    }

    @Test
    public void test06() {
        MaximalProfit sol = new MaximalProfit();
        int[] arr = {2, 4};
        Assert.assertEquals(2, sol.maximalProfit(arr));
    }

    @Test
    public void test07() {
        MaximalProfit sol = new MaximalProfit();
        int[] arr = {4, 2};
        Assert.assertEquals(-2, sol.maximalProfit(arr));
    }

    @Test
    public void test08() {
        MaximalProfit sol = new MaximalProfit();
        int[] arr = null;
        Assert.assertEquals(0, sol.maximalProfit(arr));
    }
}
