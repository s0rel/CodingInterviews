package org.sorel.problemset.p082;

import org.junit.Assert;
import org.junit.Test;

public class TestMinNumberInRotatedArray {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
    }

    @Test
    public void test01() {
        MinNumberInRotatedArray sol = new MinNumberInRotatedArray();
        int[] arr = {3, 4, 5, 1, 2};
        Assert.assertEquals(1, sol.minNumber(arr));
    }

    @Test
    public void test02() {
        MinNumberInRotatedArray sol = new MinNumberInRotatedArray();
        int[] arr = {3, 4, 5, 1, 1, 2};
        Assert.assertEquals(1, sol.minNumber(arr));
    }

    @Test
    public void test03() {
        MinNumberInRotatedArray sol = new MinNumberInRotatedArray();
        int[] arr = {3, 4, 5, 1, 2, 2};
        Assert.assertEquals(1, sol.minNumber(arr));
    }

    @Test
    public void test04() {
        MinNumberInRotatedArray sol = new MinNumberInRotatedArray();
        int[] arr = {1, 0, 1, 1, 1};
        Assert.assertEquals(0, sol.minNumber(arr));
    }

    @Test
    public void test05() {
        MinNumberInRotatedArray sol = new MinNumberInRotatedArray();
        int[] arr = {1, 2, 3, 4, 5};
        Assert.assertEquals(1, sol.minNumber(arr));
    }

    @Test
    public void test06() {
        MinNumberInRotatedArray sol = new MinNumberInRotatedArray();
        int[] arr = {2};
        Assert.assertEquals(2, sol.minNumber(arr));
    }

    @Test
    public void test07() {
        MinNumberInRotatedArray sol = new MinNumberInRotatedArray();
        int[] arr = null;
        Assert.assertEquals(-1, sol.minNumber(arr));
    }
}
