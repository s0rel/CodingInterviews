package org.sorel.problemset.p233;

import org.junit.Assert;
import org.junit.Test;

public class TestMaxValueOfGifts {
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
        MaxValueOfGifts sol = new MaxValueOfGifts();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Assert.assertEquals(29, sol.getMaxVaule(matrix));
    }

    @Test
    public void test02() {
        MaxValueOfGifts sol = new MaxValueOfGifts();
        int[][] matrix = {
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5}
        };
        Assert.assertEquals(53, sol.getMaxVaule(matrix));
    }

    @Test
    public void test03() {
        MaxValueOfGifts sol = new MaxValueOfGifts();
        int[][] matrix = {
                {1, 10, 3, 8}
        };
        Assert.assertEquals(22, sol.getMaxVaule(matrix));
    }

    @Test
    public void test04() {
        MaxValueOfGifts sol = new MaxValueOfGifts();
        int[][] matrix = {
                {1},
                {12},
                {5},
                {3}
        };
        Assert.assertEquals(21, sol.getMaxVaule(matrix));
    }

    @Test
    public void test05() {
        MaxValueOfGifts sol = new MaxValueOfGifts();
        int[][] matrix = {
                {3}
        };
        Assert.assertEquals(3, sol.getMaxVaule(matrix));
    }

    @Test
    public void test06() {
        MaxValueOfGifts sol = new MaxValueOfGifts();
        int[][] matrix = null;
        Assert.assertEquals(0, sol.getMaxVaule(matrix));
    }
}
