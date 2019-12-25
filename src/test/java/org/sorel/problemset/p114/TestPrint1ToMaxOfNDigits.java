package org.sorel.problemset.p114;

import org.junit.jupiter.api.Test;

public class TestPrint1ToMaxOfNDigits {
    @Test
    public void test() {
        Print1ToMaxOfNDigits sol = new Print1ToMaxOfNDigits();
        sol.print1ToMaxOfNDigits(1);
        sol.print1ToMaxOfNDigits(2);
        sol.print1ToMaxOfNDigits(3);
        sol.print1ToMaxOfNDigits(0);
        sol.print1ToMaxOfNDigits(-1);
    }
}
