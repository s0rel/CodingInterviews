package org.sorel.problemset.p231;

import org.junit.Assert;
import org.junit.Test;

public class TestTranslateNumbersToStrings {
    @Test
    public void test01() {
        TranslateNumbersToStrings sol = new TranslateNumbersToStrings();
        Assert.assertEquals(1, sol.getTranslationCount(0));
        Assert.assertEquals(2, sol.getTranslationCount(10));
        Assert.assertEquals(3, sol.getTranslationCount(125));
        Assert.assertEquals(2, sol.getTranslationCount(126));
        Assert.assertEquals(1, sol.getTranslationCount(426));
        Assert.assertEquals(2, sol.getTranslationCount(100));
        Assert.assertEquals(2, sol.getTranslationCount(101));
        Assert.assertEquals(5, sol.getTranslationCount(12258));
        Assert.assertEquals(0, sol.getTranslationCount(-100));
    }
}
