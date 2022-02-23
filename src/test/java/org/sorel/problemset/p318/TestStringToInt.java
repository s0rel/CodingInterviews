package org.sorel.problemset.p318;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestStringToInt {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
    }

    @Test
    public void test01() {
        StringToInt sol = new StringToInt();
        String s = "82";
        Assertions.assertEquals(82, sol.strToInt(s));
    }

    @Test
    public void test02() {
        StringToInt sol = new StringToInt();
        String s = "   -12  ";
        Assertions.assertEquals(-12, sol.strToInt(s));
    }

    @Test
    public void test03() {
        StringToInt sol = new StringToInt();
        String s = "4396 clearlove";
        Assertions.assertEquals(4396, sol.strToInt(s));
    }

    @Test
    public void test04() {
        StringToInt sol = new StringToInt();
        String s = "clearlove 4396";
        Assertions.assertEquals(0, sol.strToInt(s));
    }

    @Test
    public void test05() {
        StringToInt sol = new StringToInt();
        String s = "-987654321111";
        Assertions.assertEquals(-2147483648, sol.strToInt(s));
    }

    @Test
    public void test06() {
        StringToInt sol = new StringToInt();
        String s = "+";
        Assertions.assertEquals(0, sol.strToInt(s));
    }

    @Test
    public void test07() {
        StringToInt sol = new StringToInt();
        String s = "0";
        Assertions.assertEquals(0, sol.strToInt(s));
    }
}
