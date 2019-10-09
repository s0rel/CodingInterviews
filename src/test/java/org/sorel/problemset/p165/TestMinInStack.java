package org.sorel.problemset.p165;

import org.junit.Assert;
import org.junit.Test;

public class TestMinInStack {
    @Test
    public void test() {
        MinInStack<Integer> sol = new MinInStack<>();
        sol.push(3);
        Assert.assertSame(3, sol.getMin());
        sol.push(4);
        Assert.assertSame(3, sol.getMin());
        sol.push(2);
        Assert.assertSame(2, sol.getMin());
        sol.push(3);
        Assert.assertSame(2, sol.getMin());
        sol.pop();
        Assert.assertSame(2, sol.getMin());
        sol.pop();
        Assert.assertSame(3, sol.getMin());
        sol.pop();
        Assert.assertSame(3, sol.getMin());
        sol.push(0);
        Assert.assertSame(0, sol.getMin());
    }
}
