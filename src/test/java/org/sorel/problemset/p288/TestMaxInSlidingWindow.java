package org.sorel.problemset.p288;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMaxInSlidingWindow {
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
        test09();
    }

    @Test
    public void test01() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {2, 3, 4, 2, 6, 2, 5, 1};
        int size = 3;
        Assert.assertEquals(Arrays.asList(4, 4, 6, 6, 6, 5), sol.maxInWindows(arr, size));
    }

    @Test
    public void test02() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int size = 3;
        Assert.assertEquals(Arrays.asList(3, 3, 5, 5, 6, 7), sol.maxInWindows(arr, size));
    }

    @Test
    public void test03() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int size = 4;
        Assert.assertEquals(Arrays.asList(7, 9, 11, 13, 15), sol.maxInWindows(arr, size));
    }

    @Test
    public void test04() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {16, 14, 12, 10, 8, 6, 4};
        int size = 5;
        Assert.assertEquals(Arrays.asList(16, 14, 12), sol.maxInWindows(arr, size));
    }

    @Test
    public void test05() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {10, 14, 12, 11};
        int size = 1;
        Assert.assertEquals(Arrays.asList(10, 14, 12, 11), sol.maxInWindows(arr, size));
    }

    @Test
    public void test06() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {10, 14, 12, 11};
        int size = 4;
        Assert.assertEquals(Arrays.asList(14), sol.maxInWindows(arr, size));
    }

    @Test
    public void test07() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {10, 14, 12, 11};
        int size = 0;
        Assert.assertEquals(new ArrayList<>(), sol.maxInWindows(arr, size));
    }

    @Test
    public void test08() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = {10, 14, 12, 11};
        int size = 5;
        Assert.assertEquals(new ArrayList<>(), sol.maxInWindows(arr, size));
    }

    @Test
    public void test09() {
        MaxInSlidingWindow sol = new MaxInSlidingWindow();
        int[] arr = null;
        int size = 5;
        Assert.assertEquals(new ArrayList<>(), sol.maxInWindows(arr, size));
    }
}
