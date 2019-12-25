package org.sorel.problemset.p247;

import org.junit.jupiter.api.Test;

public class TestFirstCharacterInStream {
    @Test
    public void test() {
        FirstCharacterInStream.CharStatistics sol = new FirstCharacterInStream.CharStatistics();
        String str = "google";
        System.out.println(sol.find());
        for (int i = 0; i < str.length(); i++) {
            sol.insert(str.charAt(i));
            System.out.println(sol.find());
        }
    }
}
