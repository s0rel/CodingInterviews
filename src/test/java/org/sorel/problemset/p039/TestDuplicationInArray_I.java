package org.sorel.problemset.p039;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuplicationInArray_I {
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
        DuplicationInArray_I sol = new DuplicationInArray_I();
        int[] arr = {2, 1, 3, 1, 4};
        Assertions.assertEquals(1, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test02() {
        DuplicationInArray_I sol = new DuplicationInArray_I();
        int[] arr = {2, 4, 3, 1, 4};
        Assertions.assertEquals(4, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test03() {
        DuplicationInArray_I sol = new DuplicationInArray_I();
        int[] arr = {2, 4, 2, 1, 4};
        Assertions.assertEquals(2, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test04() {
        DuplicationInArray_I sol = new DuplicationInArray_I();
        int[] arr = {2, 1, 3, 0, 4};
        Assertions.assertEquals(-1, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test05() {
        DuplicationInArray_I sol = new DuplicationInArray_I();
        int[] arr = null;
        Assertions.assertEquals(-1, sol.findDuplicateNumber(arr));
    }
}