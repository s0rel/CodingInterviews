package org.sorel.problemset.p100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumberOf1InBinary {
    @Test
    public void test() {
        NumberOf1InBinary sol = new NumberOf1InBinary();
        Assertions.assertEquals(0, sol.numberOfOne(0));
        Assertions.assertEquals(1, sol.numberOfOne(1));
        Assertions.assertEquals(2, sol.numberOfOne(10));
        Assertions.assertEquals(31, sol.numberOfOne(0x7FFFFFFF));
        Assertions.assertEquals(32, sol.numberOfOne(0xFFFFFFFF));
        Assertions.assertEquals(1, sol.numberOfOne(0x80000000));
    }
}
