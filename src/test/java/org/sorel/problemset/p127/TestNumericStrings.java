package org.sorel.problemset.p127;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumericStrings {
    @Test
    public void test() {
        NumericStrings sol = new NumericStrings();
        Assertions.assertTrue(sol.isNumeric("100"));
        Assertions.assertTrue(sol.isNumeric("123.45e+6"));
        Assertions.assertTrue(sol.isNumeric("+500"));
        Assertions.assertTrue(sol.isNumeric("5e2"));
        Assertions.assertTrue(sol.isNumeric("3.1416"));
        Assertions.assertTrue(sol.isNumeric("600."));
        Assertions.assertTrue(sol.isNumeric(".123"));
        Assertions.assertTrue(sol.isNumeric("-1E-16"));
        Assertions.assertTrue(sol.isNumeric("1.79769313486232E+308"));
        Assertions.assertFalse(sol.isNumeric("12e"));
        Assertions.assertFalse(sol.isNumeric("1a3.14"));
        Assertions.assertFalse(sol.isNumeric("1+23"));
        Assertions.assertFalse(sol.isNumeric("+-5"));
        Assertions.assertFalse(sol.isNumeric("12e+5.4"));
        Assertions.assertFalse(sol.isNumeric(""));
        Assertions.assertFalse(sol.isNumeric(".e1"));
        Assertions.assertFalse(sol.isNumeric("e1"));
        Assertions.assertFalse(sol.isNumeric("+."));
        Assertions.assertFalse(sol.isNumeric(null));
    }
}
