package org.sorel.problemset.p286;

import org.junit.Assert;
import org.junit.Test;

public class TestLeftRotateString {
    @Test
    public void test01() {
        LeftRotateString sol = new LeftRotateString();
        String str = "abcdefg";
        int i = 2;
        Assert.assertEquals("cdefgab", sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 1;
        Assert.assertEquals("bcdefga", sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 6;
        Assert.assertEquals("gabcdef", sol.leftRotateString(str, i));

        str = null;
        i = 6;
        Assert.assertNull(sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 0;
        Assert.assertEquals("abcdefg", sol.leftRotateString(str, i));

        str = "abcdefg";
        i = 7;
        Assert.assertEquals("abcdefg", sol.leftRotateString(str, i));
    }
}
