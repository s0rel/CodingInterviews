package org.sorel.problemset.p44;

import org.junit.Assert;
import org.junit.Test;

public class TestFindInPartiallySortedMatrix {
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
        FindInPartiallySortedMatrix sol = new FindInPartiallySortedMatrix();
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int n = 7;
        Assert.assertTrue(sol.searchIn2DArray(matrix, n));
    }

    @Test
    public void test02() {
        FindInPartiallySortedMatrix sol = new FindInPartiallySortedMatrix();
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int n = 5;
        Assert.assertFalse(sol.searchIn2DArray(matrix, n));
    }

    @Test
    public void test03() {
        FindInPartiallySortedMatrix sol = new FindInPartiallySortedMatrix();
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int n = 1;
        Assert.assertTrue(sol.searchIn2DArray(matrix, n));
    }

    @Test
    public void test04() {
        FindInPartiallySortedMatrix sol = new FindInPartiallySortedMatrix();
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int n = 15;
        Assert.assertTrue(sol.searchIn2DArray(matrix, n));
    }

    @Test
    public void test05() {
        FindInPartiallySortedMatrix sol = new FindInPartiallySortedMatrix();
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int n = 0;
        Assert.assertFalse(sol.searchIn2DArray(matrix, n));
    }

    @Test
    public void test06() {
        FindInPartiallySortedMatrix sol = new FindInPartiallySortedMatrix();
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int n = 16;
        Assert.assertFalse(sol.searchIn2DArray(matrix, n));
    }

    @Test
    public void test07() {
        FindInPartiallySortedMatrix sol = new FindInPartiallySortedMatrix();
        int[][] matrix = null;
        int n = 16;
        Assert.assertFalse(sol.searchIn2DArray(matrix, n));
    }
}