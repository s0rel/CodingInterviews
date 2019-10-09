package org.sorel.problemset.p089;

import org.junit.Assert;
import org.junit.Test;

public class TestStringPathInMatrix {
    @Test
    public void test() {
        StringPathInMatrix sol = new StringPathInMatrix();
        char[][] matrix = {{'A', 'B', 'T', 'G'}, {'C', 'F', 'C', 'S'}, {'J', 'D', 'E', 'H'}};
        String str = "BFCE";
        Assert.assertTrue(sol.hasPath(matrix, str));
    }
}
