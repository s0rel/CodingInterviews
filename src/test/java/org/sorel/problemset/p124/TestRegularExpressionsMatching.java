package org.sorel.problemset.p124;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRegularExpressionsMatching {
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
        test11();
        test12();
        test13();
        test14();
        test15();
        test16();
        test17();
        test18();
        test19();
        test20();
        test21();
        test22();
        test23();
        test24();
        test25();
        test26();
        test27();
        test28();
        test29();
    }

    @Test
    public void test01() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("", "");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test02() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("", ".*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test03() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("", ".");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test04() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("", "c*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test05() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("a", ".*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test06() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("a", "a.");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test07() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("a", "");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test08() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("a", ".");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test09() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("a", "ab*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test10() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("a", "ab*a");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test11() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aa", "aa");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test12() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aa", "a*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test13() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aa", ".*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test14() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aa", ".");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test15() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("ab", ".*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test16() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", "aa*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test17() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", "aa.a");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test18() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", "a.a");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test19() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", ".a");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test20() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", "a*a");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test21() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", "ab*a");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test22() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", "ab*ac*a");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test23() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", "ab*a*c*a");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test24() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaa", ".*");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test25() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aab", "c*a*b");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test26() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaca", "ab*a*c*a");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test27() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("aaba", "ab*a*c*a");
        Assertions.assertFalse(flag);
    }

    @Test
    public void test28() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("bbbba", ".*a*a");
        Assertions.assertTrue(flag);
    }

    @Test
    public void test29() {
        RegularExpressionsMatching sol = new RegularExpressionsMatching();
        boolean flag = sol.match("bcbbabab", ".*a*a");
        Assertions.assertFalse(flag);
    }
}
