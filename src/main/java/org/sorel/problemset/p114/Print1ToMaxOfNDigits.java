package org.sorel.problemset.p114;

public class Print1ToMaxOfNDigits {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            return;
        }

        StringBuilder num = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            num.append("0");
        }

        while (isIncrement(num)) {
            printNumber(num);
        }
    }

    private boolean isIncrement(StringBuilder num) {
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) < '9' && num.charAt(i) >= '0') {
                num.setCharAt(i, (char) (num.charAt(i) + 1));
                return true;
            } else if (num.charAt(i) == '9') {
                num.setCharAt(i, '0');
            }
        }
        return false;
    }

    private void printNumber(StringBuilder num) {
        boolean flag = false;
        int len = num.length();
        for (int i = 0; i < len; i++) {
            if (flag) {
                System.out.print(num.charAt(i));
            } else {
                if (num.charAt(i) != '0') {
                    flag = true;
                    System.out.print(num.charAt(i));
                }
            }
        }
        System.out.println();
    }
}
