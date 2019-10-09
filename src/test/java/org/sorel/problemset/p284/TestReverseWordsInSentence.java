package org.sorel.problemset.p284;

import org.junit.Assert;
import org.junit.Test;

public class TestReverseWordsInSentence {
    @Test
    public void test() {
        ReverseWordsInSentence sol = new ReverseWordsInSentence();
        String str = "I am a student.";
        Assert.assertEquals("student. a am I", sol.reverse(str));

        str = "Wonderful";
        Assert.assertEquals("Wonderful", sol.reverse(str));

        str = null;
        Assert.assertEquals("", sol.reverse(str));

        str = "";
        Assert.assertEquals("", sol.reverse(str));

        str = "   ";
        Assert.assertEquals("   ", sol.reverse(str));
    }
}
