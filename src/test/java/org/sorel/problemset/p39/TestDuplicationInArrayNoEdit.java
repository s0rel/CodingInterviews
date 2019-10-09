package org.sorel.problemset.p39;

import org.junit.Assert;
import org.junit.Test;

public class TestDuplicationInArrayNoEdit {
    @Test
    public void test() {
        DuplicationInArrayNoEdit sol = new DuplicationInArrayNoEdit();
        int[] arr = {1, 2, 3, 2};
        Assert.assertEquals(2, sol.findDuplicateNumber(arr));
    }
}
