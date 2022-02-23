package org.sorel.problemset.p243;

import org.junit.jupiter.api.Test;

public class TestFirstNotRepeatingChar {
    @Test
    public void test() {
        FirstNotRepeatingChar sol = new FirstNotRepeatingChar();
        System.out.println(sol.firstNotRepeatingChar("google"));
        System.out.println(sol.firstNotRepeatingChar("aabccdbd"));
        System.out.println(sol.firstNotRepeatingChar("abcdefg"));
        System.out.println(sol.firstNotRepeatingChar(null));
    }
}
