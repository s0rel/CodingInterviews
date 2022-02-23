package org.sorel.problemset.p041;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuplicationInArrayNoEdit {
    @Test
    public void test() {
        test01();
        test02();
    }

    @Test
    public void test01() {
        DuplicationInArrayNoEdit sol = new DuplicationInArrayNoEdit();
        int[] arr = {1, 2, 3, 2};
        Assertions.assertEquals(2, sol.findDuplicateNumber(arr));
    }

    @Test
    public void test02() {
        DuplicationInArrayNoEdit sol = new DuplicationInArrayNoEdit();
        int[] arr = {3, 2, 6, 7, 2, 3, 5, 4};
        Assertions.assertEquals(3, sol.findDuplicateNumber(arr));
    }
}
