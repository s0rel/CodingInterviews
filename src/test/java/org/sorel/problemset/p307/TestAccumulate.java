package org.sorel.problemset.p307;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAccumulate {
    @Test
    public void test() {
        Accumulate sol = new Accumulate();
        Assertions.assertEquals(1, sol.getSum(1));
        Assertions.assertEquals(15, sol.getSum(5));
        Assertions.assertEquals(55, sol.getSum(10));
        Assertions.assertEquals(0, sol.getSum(0));
    }
}
