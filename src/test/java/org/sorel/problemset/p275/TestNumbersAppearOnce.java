package org.sorel.problemset.p275;

import org.junit.Assert;
import org.junit.Test;

public class TestNumbersAppearOnce {
    @Test
    public void test() {
        test01();
        test02();
        test03();
    }

    @Test
    public void test01() {
        NumbersAppearOnce sol = new NumbersAppearOnce();
        int[] arr = {2, 4, 3, 6, 3, 2, 5, 5};
        Assert.assertArrayEquals(new int[]{4, 6}, sol.findNumsAppearOnce(arr));
    }

    @Test
    public void test02() {
        NumbersAppearOnce sol = new NumbersAppearOnce();
        int[] arr = {4, 6};
        Assert.assertArrayEquals(new int[]{4, 6}, sol.findNumsAppearOnce(arr));
    }

    @Test
    public void test03() {
        NumbersAppearOnce sol = new NumbersAppearOnce();
        int[] arr = {4, 6, 1, 1, 1, 1};
        Assert.assertArrayEquals(new int[]{4, 6}, sol.findNumsAppearOnce(arr));
    }
}
