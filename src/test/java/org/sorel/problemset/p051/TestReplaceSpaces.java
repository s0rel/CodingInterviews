package org.sorel.problemset.p051;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestReplaceSpaces {
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
    }

    @Test
    public void test01() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = "hello world";
        Assertions.assertEquals("hello%20world", sol.replaceSpaces(s));
    }

    @Test
    public void test02() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = " helloworld";
        Assertions.assertEquals("%20helloworld", sol.replaceSpaces(s));
    }

    @Test
    public void test03() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = "helloworld ";
        Assertions.assertEquals("helloworld%20", sol.replaceSpaces(s));
    }

    @Test
    public void test04() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = "hello  world";
        Assertions.assertEquals("hello%20%20world", sol.replaceSpaces(s));
    }

    @Test
    public void test05() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = null;
        Assertions.assertNull(sol.replaceSpaces(s));
    }

    @Test
    public void test06() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = "";
        Assertions.assertEquals("", sol.replaceSpaces(s));
    }

    @Test
    public void test07() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = " ";
        Assertions.assertEquals("%20", sol.replaceSpaces(s));
    }

    @Test
    public void test08() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = "helloworld";
        Assertions.assertEquals("helloworld", sol.replaceSpaces(s));
    }

    @Test
    public void test09() {
        ReplaceSpaces sol = new ReplaceSpaces();
        String s = "   ";
        Assertions.assertEquals("%20%20%20", sol.replaceSpaces(s));
    }
}