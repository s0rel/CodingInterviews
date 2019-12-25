package org.sorel.problemset.p089;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringPathInMatrix {
    @Test
    public void test() {
        StringPathInMatrix sol = new StringPathInMatrix();
        char[][] matrix = {{'A', 'B', 'T', 'G'}, {'C', 'F', 'C', 'S'}, {'J', 'D', 'E', 'H'}};
        String str = "BFCE";
        Assertions.assertTrue(sol.hasPath(matrix, str));
    }
}
