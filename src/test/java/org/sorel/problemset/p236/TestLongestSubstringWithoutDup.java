package org.sorel.problemset.p236;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLongestSubstringWithoutDup {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
        test08();
        test09();
        test10();
    }

    @Test
    public void test01() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "abcacfrar";
        Assertions.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test02() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "acfrarabc";
        Assertions.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test03() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "arabcacfr";
        Assertions.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test04() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "aaaa";
        Assertions.assertEquals(1, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test05() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "abcdefg";
        Assertions.assertEquals(7, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test06() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "aaabbbccc";
        Assertions.assertEquals(2, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test07() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "abcdcba";
        Assertions.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test08() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "abcdaef";
        Assertions.assertEquals(6, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test09() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "a";
        Assertions.assertEquals(1, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test10() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "";
        Assertions.assertEquals(0, sol.longestSubstringWithoutDup(input));
    }
}
