package org.sorel.problemset.p310;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAddTwoNumbers {
    @Test
    public void test01() {
        AddTwoNumbers sol = new AddTwoNumbers();
        Assertions.assertEquals(3, sol.add(1, 2));
        Assertions.assertEquals(1010, sol.add(111, 899));
        Assertions.assertEquals(1, sol.add(-1, 2));
        Assertions.assertEquals(-1, sol.add(1, -2));
        Assertions.assertEquals(3, sol.add(3, 0));
        Assertions.assertEquals(-4, sol.add(0, -4));
        Assertions.assertEquals(-10, sol.add(-2, -8));
    }
}
