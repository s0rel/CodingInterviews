package org.sorel.problemset.p206;

import org.junit.Assert;
import org.junit.Test;

public class TestMoreThanHalfNumber {
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
        MoreThanHalfNumber sol = new MoreThanHalfNumber();
        int[] numbers = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        Assert.assertEquals(2, sol.moreThanHalfNumber(numbers));
    }

    @Test
    public void test02() {
        MoreThanHalfNumber sol = new MoreThanHalfNumber();
        int[] numbers = {1, 2, 3, 2, 4, 2, 5, 2, 3};
        Assert.assertEquals(0, sol.moreThanHalfNumber(numbers));
    }

    @Test
    public void test03() {
        MoreThanHalfNumber sol = new MoreThanHalfNumber();
        int[] numbers = {2, 2, 2, 2, 2, 1, 3, 4, 5};
        Assert.assertEquals(2, sol.moreThanHalfNumber(numbers));
    }

    @Test
    public void test04() {
        MoreThanHalfNumber sol = new MoreThanHalfNumber();
        int[] numbers = {1, 3, 4, 5, 2, 2, 2, 2, 2};
        Assert.assertEquals(2, sol.moreThanHalfNumber(numbers));
    }

    @Test
    public void test05() {
        MoreThanHalfNumber sol = new MoreThanHalfNumber();
        int[] numbers = {1};
        Assert.assertEquals(1, sol.moreThanHalfNumber(numbers));
    }

    @Test
    public void test06() {
        MoreThanHalfNumber sol = new MoreThanHalfNumber();
        int[] numbers = null;
        Assert.assertEquals(0, sol.moreThanHalfNumber(numbers));
    }
}
