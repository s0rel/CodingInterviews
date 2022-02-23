package org.sorel.problemset.p231;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTranslateNumbersToStrings {
    @Test
    public void test01() {
        TranslateNumbersToStrings sol = new TranslateNumbersToStrings();
        Assertions.assertEquals(1, sol.getTranslationCount(0));
        Assertions.assertEquals(2, sol.getTranslationCount(10));
        Assertions.assertEquals(3, sol.getTranslationCount(125));
        Assertions.assertEquals(2, sol.getTranslationCount(126));
        Assertions.assertEquals(1, sol.getTranslationCount(426));
        Assertions.assertEquals(2, sol.getTranslationCount(100));
        Assertions.assertEquals(2, sol.getTranslationCount(101));
        Assertions.assertEquals(5, sol.getTranslationCount(12258));
        Assertions.assertEquals(0, sol.getTranslationCount(-100));
    }
}
