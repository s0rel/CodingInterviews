package org.sorel.problemset.p267;

import org.junit.Assert;
import org.junit.Test;

public class TestIntegerIdenticalToIndex {
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
        IntegerIdenticalToIndex sol = new IntegerIdenticalToIndex();
        int[] numbers = {-3, -1, 1, 3, 5};
        Assert.assertEquals(3, sol.getNumberSameAsIndex(numbers));
    }

    @Test
    public void test02() {
        IntegerIdenticalToIndex sol = new IntegerIdenticalToIndex();
        int[] numbers = {0, 1, 3, 5, 6};
        Assert.assertEquals(0, sol.getNumberSameAsIndex(numbers));
    }

    @Test
    public void test03() {
        IntegerIdenticalToIndex sol = new IntegerIdenticalToIndex();
        int[] numbers = {-1, 0, 1, 2, 4};
        Assert.assertEquals(4, sol.getNumberSameAsIndex(numbers));
    }

    @Test
    public void test04() {
        IntegerIdenticalToIndex sol = new IntegerIdenticalToIndex();
        int[] numbers = {-1, 0, 1, 2, 5};
        Assert.assertEquals(-1, sol.getNumberSameAsIndex(numbers));
    }

    @Test
    public void test05() {
        IntegerIdenticalToIndex sol = new IntegerIdenticalToIndex();
        int[] numbers = {0};
        Assert.assertEquals(0, sol.getNumberSameAsIndex(numbers));
    }

    @Test
    public void test06() {
        IntegerIdenticalToIndex sol = new IntegerIdenticalToIndex();
        int[] numbers = {10};
        Assert.assertEquals(-1, sol.getNumberSameAsIndex(numbers));
    }

    @Test
    public void test07() {
        IntegerIdenticalToIndex sol = new IntegerIdenticalToIndex();
        int[] numbers = null;
        Assert.assertEquals(-1, sol.getNumberSameAsIndex(numbers));
    }
}
