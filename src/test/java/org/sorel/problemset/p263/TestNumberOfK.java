package org.sorel.problemset.p263;

import org.junit.Assert;
import org.junit.Test;

public class TestNumberOfK {
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
        test10();
        test11();
    }

    @Test
    public void test01() {
        NumberOfK sol = new NumberOfK();
        int[] data = {1, 2, 3, 3, 3, 3, 4, 5};
        int k = 3;
        Assert.assertEquals(4, sol.getNumberOfK(data, k));
    }

    @Test
    public void test02() {
        NumberOfK sol = new NumberOfK();
        int[] data = {3, 3, 3, 3, 4, 5};
        int k = 3;
        Assert.assertEquals(4, sol.getNumberOfK(data, k));
    }

    @Test
    public void test03() {
        NumberOfK sol = new NumberOfK();
        int[] data = {1, 2, 3, 3, 3, 3};
        int k = 3;
        Assert.assertEquals(4, sol.getNumberOfK(data, k));
    }

    @Test
    public void test04() {
        NumberOfK sol = new NumberOfK();
        int[] data = {1, 3, 3, 3, 3, 4, 5};
        int k = 2;
        Assert.assertEquals(0, sol.getNumberOfK(data, k));
    }

    @Test
    public void test05() {
        NumberOfK sol = new NumberOfK();
        int[] data = {1, 3, 3, 3, 3, 4, 5};
        int k = 0;
        Assert.assertEquals(0, sol.getNumberOfK(data, k));
    }

    @Test
    public void test06() {
        NumberOfK sol = new NumberOfK();
        int[] data = {1, 3, 3, 3, 3, 4, 5};
        int k = 6;
        Assert.assertEquals(0, sol.getNumberOfK(data, k));
    }

    @Test
    public void test07() {
        NumberOfK sol = new NumberOfK();
        int[] data = {3, 3, 3, 3};
        int k = 3;
        Assert.assertEquals(4, sol.getNumberOfK(data, k));
    }

    @Test
    public void test08() {
        NumberOfK sol = new NumberOfK();
        int[] data = {3, 3, 3, 3};
        int k = 4;
        Assert.assertEquals(0, sol.getNumberOfK(data, k));
    }

    @Test
    public void test09() {
        NumberOfK sol = new NumberOfK();
        int[] data = {3};
        int k = 3;
        Assert.assertEquals(1, sol.getNumberOfK(data, k));
    }

    @Test
    public void test10() {
        NumberOfK sol = new NumberOfK();
        int[] data = {3};
        int k = 4;
        Assert.assertEquals(0, sol.getNumberOfK(data, k));
    }

    @Test
    public void test11() {
        NumberOfK sol = new NumberOfK();
        int[] data = null;
        int k = 0;
        Assert.assertEquals(0, sol.getNumberOfK(data, k));
    }
}
