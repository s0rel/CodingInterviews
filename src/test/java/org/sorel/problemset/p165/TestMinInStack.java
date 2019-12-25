package org.sorel.problemset.p165;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMinInStack {
    @Test
    public void test() {
        MinInStack<Integer> sol = new MinInStack<>();
        sol.push(3);
        Assertions.assertSame(3, sol.getMin());
        sol.push(4);
        Assertions.assertSame(3, sol.getMin());
        sol.push(2);
        Assertions.assertSame(2, sol.getMin());
        sol.push(3);
        Assertions.assertSame(2, sol.getMin());
        sol.pop();
        Assertions.assertSame(2, sol.getMin());
        sol.pop();
        Assertions.assertSame(3, sol.getMin());
        sol.pop();
        Assertions.assertSame(3, sol.getMin());
        sol.push(0);
        Assertions.assertSame(0, sol.getMin());
    }
}
