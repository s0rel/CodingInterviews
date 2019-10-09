package org.sorel.problemset.p310;

public class AddTwoNumbers {
    public int add(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        int temp;
        while (carry != 0) {
            temp = sum;
            sum = sum ^ carry;
            carry = (carry & temp) << 1;
        }
        return sum;
    }
}
