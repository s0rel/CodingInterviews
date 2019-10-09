package org.sorel.problemset.p247;

public class FirstCharacterInStream {
    public static class CharStatistics {
        private int[] times;
        private int index;

        public CharStatistics() {
            index = 0;
            times = new int[256];
            // -1 表示未出现，>=0 表示出现的位置且仅出现一次，-2 表示出现两次及以上
            for (int i = 0; i < 256; i++)
                times[i] = -1;
        }

        public void insert(char ch) {
            if (times[ch] == -1)
                times[ch] = index;
            else
                times[ch] = -2;
            index++;
        }

        public char find() {
            int minIndex = 256;
            char res = '\77'; // 若没有只出现一次的字符，显示 "\77"，即 ？
            for (int i = 0; i < 256; i++) {
                if (times[i] >= 0 && times[i] < minIndex) {
                    minIndex = times[i];
                    res = (char) i;
                }
            }
            return res;
        }
    }
}
