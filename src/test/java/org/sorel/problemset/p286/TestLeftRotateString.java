package org.sorel.problemset.p286;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLeftRotateString {
    @Test
    public void test() {
        LeftRotateString sol = new LeftRotateString();
        String str = "abcdefg";
        int i = 2;
        Assertions.assertEquals("cdefgab", sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 1;
        Assertions.assertEquals("bcdefga", sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 6;
        Assertions.assertEquals("gabcdef", sol.leftRotateString(str, i));

        str = null;
        i = 6;
        Assertions.assertNull(sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 0;
        Assertions.assertEquals("abcdefg", sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 7;
        Assertions.assertEquals("abcdefg", sol.leftRotateString(str, i));

        str = "";
        i = 0;
        Assertions.assertEquals("", sol.leftRotateString(str, i));
    }
}
