package org.sorel.problemset.p127;

import org.junit.Assert;
import org.junit.Test;

public class TestNumericStrings {
    @Test
    public void test() {
        NumericStrings sol = new NumericStrings();
        Assert.assertTrue(sol.isNumeric("100"));
        Assert.assertTrue(sol.isNumeric("123.45e+6"));
        Assert.assertTrue(sol.isNumeric("+500"));
        Assert.assertTrue(sol.isNumeric("5e2"));
        Assert.assertTrue(sol.isNumeric("3.1416"));
        Assert.assertTrue(sol.isNumeric("600."));
        Assert.assertTrue(sol.isNumeric(".123"));
        Assert.assertTrue(sol.isNumeric("-1E-16"));
        Assert.assertTrue(sol.isNumeric("1.79769313486232E+308"));
        Assert.assertFalse(sol.isNumeric("12e"));
        Assert.assertFalse(sol.isNumeric("1a3.14"));
        Assert.assertFalse(sol.isNumeric("1+23"));
        Assert.assertFalse(sol.isNumeric("+-5"));
        Assert.assertFalse(sol.isNumeric("12e+5.4"));
        Assert.assertFalse(sol.isNumeric(""));
        Assert.assertFalse(sol.isNumeric(".e1"));
        Assert.assertFalse(sol.isNumeric("e1"));
        Assert.assertFalse(sol.isNumeric("+."));
        Assert.assertFalse(sol.isNumeric(null));
    }
}
