package org.sorel.problemset.p278;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumberAppearingOnce {
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
    }

    @Test
    public void test01() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {1, 1, 2, 2, 2, 1, 3};
        Assertions.assertEquals(3, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test02() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {4, 3, 3, 2, 2, 2, 3};
        Assertions.assertEquals(4, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test03() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {4, 4, 1, 1, 1, 7, 4};
        Assertions.assertEquals(7, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test04() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {-10, 214, 214, 214};
        Assertions.assertEquals(-10, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test05() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {-209, 3467, -209, -209};
        Assertions.assertEquals(3467, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test06() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {1024, -1025, 1024, -1025, 1024, -1025, 1023};
        Assertions.assertEquals(1023, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test07() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {-1024, -1024, -1024, -1023};
        Assertions.assertEquals(-1023, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test08() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {-23, 0, 214, -23, 214, -23, 214};
        Assertions.assertEquals(0, sol.findNumberAppearOnce(numbers));
    }

    @Test
    public void test09() {
        NumberAppearingOnce sol = new NumberAppearingOnce();
        int[] numbers = {0, 3467, 0, 0, 0, 0, 0, 0};
        Assertions.assertEquals(3467, sol.findNumberAppearOnce(numbers));
    }
}
