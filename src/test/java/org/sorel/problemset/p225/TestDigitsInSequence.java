package org.sorel.problemset.p225;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDigitsInSequence {
    @Test
    public void test() {
        DigitsInSequence sol = new DigitsInSequence();
        Assertions.assertEquals(0, sol.digitAtIndex(0));
        Assertions.assertEquals(1, sol.digitAtIndex(1));
        Assertions.assertEquals(9, sol.digitAtIndex(9));
        Assertions.assertEquals(1, sol.digitAtIndex(10));
        Assertions.assertEquals(9, sol.digitAtIndex(189));
        Assertions.assertEquals(1, sol.digitAtIndex(190));
        Assertions.assertEquals(3, sol.digitAtIndex(1000));
        Assertions.assertEquals(7, sol.digitAtIndex(1001));
        Assertions.assertEquals(0, sol.digitAtIndex(1002));
    }
}
