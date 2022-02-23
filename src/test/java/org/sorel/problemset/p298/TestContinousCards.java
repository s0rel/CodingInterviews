package org.sorel.problemset.p298;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestContinousCards {
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
        test12();
    }

    @Test
    public void test01() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {1, 3, 2, 5, 4};
        Assertions.assertTrue(sol.isContinous(numbers));
    }

    @Test
    public void test02() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {1, 3, 2, 6, 4};
        Assertions.assertFalse(sol.isContinous(numbers));
    }

    @Test
    public void test03() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {0, 3, 2, 6, 4};
        Assertions.assertTrue(sol.isContinous(numbers));
    }

    @Test
    public void test04() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {0, 3, 1, 6, 4};
        Assertions.assertFalse(sol.isContinous(numbers));
    }

    @Test
    public void test05() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {1, 3, 0, 5, 0};
        Assertions.assertTrue(sol.isContinous(numbers));
    }

    @Test
    public void test06() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {1, 3, 0, 7, 0};
        Assertions.assertFalse(sol.isContinous(numbers));
    }

    @Test
    public void test07() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {1, 0, 0, 5, 0};
        Assertions.assertTrue(sol.isContinous(numbers));
    }

    @Test
    public void test08() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {1, 0, 0, 7, 0};
        Assertions.assertFalse(sol.isContinous(numbers));
    }

    @Test
    public void test09() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {3, 0, 0, 0, 0};
        Assertions.assertTrue(sol.isContinous(numbers));
    }

    @Test
    public void test10() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {0, 0, 0, 0, 0};
        Assertions.assertTrue(sol.isContinous(numbers));
    }

    @Test
    public void test11() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = {1, 0, 0, 1, 0};
        Assertions.assertFalse(sol.isContinous(numbers));
    }

    @Test
    public void test12() {
        ContinousCards sol = new ContinousCards();
        int[] numbers = null;
        Assertions.assertFalse(sol.isContinous(numbers));
    }
}
