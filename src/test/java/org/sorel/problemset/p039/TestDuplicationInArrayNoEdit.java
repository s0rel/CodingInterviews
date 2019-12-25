package org.sorel.problemset.p039;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuplicationInArrayNoEdit {
    @Test
    public void test() {
        DuplicationInArrayNoEdit sol = new DuplicationInArrayNoEdit();
        int[] arr = {1, 2, 3, 2};
        Assertions.assertEquals(2, sol.findDuplicateNumber(arr));
    }
}
