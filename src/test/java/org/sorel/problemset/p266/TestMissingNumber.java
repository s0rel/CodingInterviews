package org.sorel.problemset.p266;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(0, sol.getMissingNumber(numbers));
    }

    @Test
    public void test02() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {0, 1, 2, 3, 4};
        Assertions.assertEquals(5, sol.getMissingNumber(numbers));
    }

    @Test
    public void test03() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {0, 1, 2, 4, 5};
        Assertions.assertEquals(3, sol.getMissingNumber(numbers));
    }

    @Test
    public void test04() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {1};
        Assertions.assertEquals(0, sol.getMissingNumber(numbers));
    }

    @Test
    public void test05() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = {0};
        Assertions.assertEquals(1, sol.getMissingNumber(numbers));
    }

    @Test
    public void test06() {
        MissingNumber sol = new MissingNumber();
        int[] numbers = null;
        Assertions.assertEquals(-1, sol.getMissingNumber(numbers));
    }
}
