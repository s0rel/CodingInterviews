package org.sorel.problemset.p243;

public class FirstNotRepeatingChar {
    public char firstNotRepeatingChar(String str) {
        if (str == null) {
            return '\77';
        }

        int[] times = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++) times[str.charAt(i)]++;
        for (int i = 0; i < len; i++) {
            if (times[str.charAt(i)] == 1) return str.charAt(i);
        }
        return '\77';
    }
}
