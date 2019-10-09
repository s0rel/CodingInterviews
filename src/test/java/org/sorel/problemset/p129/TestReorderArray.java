package org.sorel.problemset.p129;

import org.junit.Assert;
import org.junit.Test;

public class TestReorderArray {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
    }

    @Test
    public void test01() {
        ReorderArray sol = new ReorderArray();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] excepted = {1, 7, 3, 5, 4, 6, 2};
        sol.Reorder(numbers);
        Assert.assertArrayEquals(numbers, excepted);
    }

    @Test
    public void test02() {
        ReorderArray sol = new ReorderArray();
        int[] numbers = {2, 4, 6, 1, 3, 5, 7};
        int[] excepted = {7, 5, 3, 1, 6, 4, 2};
        sol.Reorder(numbers);
        Assert.assertArrayEquals(numbers, excepted);
    }

    @Test
    public void test03() {
        ReorderArray sol = new ReorderArray();
        int[] numbers = {1, 3, 5, 7, 2, 4, 6};
        int[] excepted = {1, 3, 5, 7, 2, 4, 6};
        sol.Reorder(numbers);
        Assert.assertArrayEquals(numbers, excepted);
    }

    @Test
    public void test04() {
        ReorderArray sol = new ReorderArray();
        int[] numbers = {1};
        int[] excepted = {1};
        sol.Reorder(numbers);
        Assert.assertArrayEquals(numbers, excepted);
    }

    @Test
    public void test05() {
        ReorderArray sol = new ReorderArray();
        int[] numbers = {2};
        int[] excepted = {2};
        sol.Reorder(numbers);
        Assert.assertArrayEquals(numbers, excepted);
    }

    @Test
    public void test06() {
        ReorderArray sol = new ReorderArray();
        int[] numbers = null;
        sol.Reorder(numbers);
        Assert.assertNull(numbers);
    }
}
