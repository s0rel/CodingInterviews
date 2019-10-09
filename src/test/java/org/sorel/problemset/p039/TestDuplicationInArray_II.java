package org.sorel.problemset.p039;

import org.junit.Assert;
import org.junit.Test;

public class TestDuplicationInArray_II {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
    }

    @Test
    public void test01() {
        DuplicationInArray_II sol = new DuplicationInArray_II();
        int[] arr = {2, 1, 3, 1, 4};
        Assert.assertEquals(1, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test02() {
        DuplicationInArray_II sol = new DuplicationInArray_II();
        int[] arr = {2, 4, 3, 1, 4};
        Assert.assertEquals(4, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test03() {
        DuplicationInArray_II sol = new DuplicationInArray_II();
        int[] arr = {2, 4, 2, 1, 4};
        Assert.assertEquals(2, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test04() {
        DuplicationInArray_II sol = new DuplicationInArray_II();
        int[] arr = {2, 1, 3, 0, 4};
        Assert.assertEquals(-1, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test05() {
        DuplicationInArray_II sol = new DuplicationInArray_II();
        int[] arr = null;
        Assert.assertEquals(-1, sol.findDuplicateNumber(arr));
    }
}