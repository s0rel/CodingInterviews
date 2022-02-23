package org.sorel.problemset.p110;

public class Power {
    public double power(double base, int exponent) {
        if (Double.compare(base, 0.0) == 0) {
            if (exponent == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (exponent == 0) {
            return 1;
        }

        int e = Math.abs(exponent);
        double res = 1.0;
        while (e != 0) {
            if ((e & 1) != 0) { // e % 2 != 0
                res *= base;
            }
            base *= base;
            e >>= 1;
        }
        return exponent < 0 ? 1 / res : res;
    }
}
