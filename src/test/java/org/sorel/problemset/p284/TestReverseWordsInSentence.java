package org.sorel.problemset.p284;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestReverseWordsInSentence {
    @Test
    public void test() {
        ReverseWordsInSentence sol = new ReverseWordsInSentence();
        String str = "I am a student.";
        Assertions.assertEquals("student. a am I", sol.reverse(str));

        str = "Wonderful";
        Assertions.assertEquals("Wonderful", sol.reverse(str));

        str = null;
        Assertions.assertEquals("", sol.reverse(str));

        str = "";
        Assertions.assertEquals("", sol.reverse(str));

        str = "   ";
        Assertions.assertEquals("   ", sol.reverse(str));
    }
}
