package org.sorel.problemset.p236;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test02() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "acfrarabc";
        Assert.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test03() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "arabcacfr";
        Assert.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test04() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "aaaa";
        Assert.assertEquals(1, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test05() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "abcdefg";
        Assert.assertEquals(7, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test06() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "aaabbbccc";
        Assert.assertEquals(2, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test07() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "abcdcba";
        Assert.assertEquals(4, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test08() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "abcdaef";
        Assert.assertEquals(6, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test09() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "a";
        Assert.assertEquals(1, sol.longestSubstringWithoutDup(input));
    }

    @Test
    public void test10() {
        LongestSubstringWithoutDup sol = new LongestSubstringWithoutDup();
        String input = "";
        Assert.assertEquals(0, sol.longestSubstringWithoutDup(input));
    }
}
