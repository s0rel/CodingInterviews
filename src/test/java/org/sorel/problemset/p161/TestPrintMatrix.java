package org.sorel.problemset.p161;

import org.junit.Test;

public class TestPrintMatrix {
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
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = {{1}};
        sol.printMatrix(matrix);
    }

    @Test
    public void test02() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(2, 2);
        sol.printMatrix(matrix);
    }

    @Test
    public void test03() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(4, 4);
        sol.printMatrix(matrix);
    }

    @Test
    public void test04() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(5, 5);
        sol.printMatrix(matrix);
    }

    @Test
    public void test05() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(5, 1);
        sol.printMatrix(matrix);
    }

    @Test
    public void test06() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(5, 2);
        sol.printMatrix(matrix);
    }

    @Test
    public void test07() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(5, 3);
        sol.printMatrix(matrix);
    }

    @Test
    public void test08() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(5, 4);
        sol.printMatrix(matrix);
    }

    @Test
    public void test09() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(1, 5);
        sol.printMatrix(matrix);
    }

    @Test
    public void test10() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(2, 5);
        sol.printMatrix(matrix);
    }

    @Test
    public void test11() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(3, 5);
        sol.printMatrix(matrix);
    }

    @Test
    public void test12() {
        PrintMatrix sol = new PrintMatrix();
        int[][] matrix = helper(4, 5);
        sol.printMatrix(matrix);
    }

    private int[][] helper(int row, int col) {
        int[][] matrix = new int[row][col];
        int cnt = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = cnt++;
            }
        }
        return matrix;
    }
}
