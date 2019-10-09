package org.sorel.problemset.p266;

import org.junit.Assert;
import org.junit.Test;

public class TestMissingNumber {
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
        MissingNumber sol = new MissingNumber();
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertEquals(0, sol.getMissingNumber(numbers));
    }

    @Test
    public void test02() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {0, 1, 2, 3, 4};
        Assert.assertEquals(5, sol.getMissingNumber(numbers));
    }

    @Test
    public void test03() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {0, 1, 2, 4, 5};
        Assert.assertEquals(3, sol.getMissingNumber(numbers));
    }

    @Test
    public void test04() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {1};
        Assert.assertEquals(0, sol.getMissingNumber(numbers));
    }

    @Test
    public void test05() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {0};
        Assert.assertEquals(1, sol.getMissingNumber(numbers));
    }

    @Test
    public void test06() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = null;
        Assert.assertEquals(-1, sol.getMissingNumber(numbers));
    }
}
