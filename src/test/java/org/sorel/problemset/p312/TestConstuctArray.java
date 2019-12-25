package org.sorel.problemset.p312;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConstuctArray {
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
        ConstuctArray sol = new ConstuctArray();
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(new int[]{120, 60, 40, 30, 24}, sol.multiply(arr));
    }

    @Test
    public void test02() {
        ConstuctArray sol = new ConstuctArray();
        int[] arr = {1, 2, 0, 4, 5};
        Assertions.assertArrayEquals(new int[]{0, 0, 40, 0, 0}, sol.multiply(arr));
    }

    @Test
    public void test03() {
        ConstuctArray sol = new ConstuctArray();
        int[] arr = {1, 2, 0, 4, 0};
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0}, sol.multiply(arr));
    }

    @Test
    public void test04() {
        ConstuctArray sol = new ConstuctArray();
        int[] arr = {1, -2, 3, -4, 5};
        Assertions.assertArrayEquals(new int[]{120, -60, 40, -30, 24}, sol.multiply(arr));
    }

    @Test
    public void test05() {
        ConstuctArray sol = new ConstuctArray();
        int[] arr = {1, -2};
        Assertions.assertArrayEquals(new int[]{-2, 1}, sol.multiply(arr));
    }
}
