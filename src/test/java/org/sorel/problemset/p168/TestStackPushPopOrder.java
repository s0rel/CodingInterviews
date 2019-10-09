package org.sorel.problemset.p168;

import org.junit.Assert;
import org.junit.Test;

public class TestStackPushPopOrder {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
    }

    @Test
    public void test01() {
        StackPushPopOrder sol = new StackPushPopOrder();
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 5, 3, 2, 1};
        Assert.assertTrue(sol.isPopOrder(push, pop));
    }

    @Test
    public void test02() {
        StackPushPopOrder sol = new StackPushPopOrder();
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {3, 5, 4, 2, 1};
        Assert.assertTrue(sol.isPopOrder(push, pop));
    }

    @Test
    public void test03() {
        StackPushPopOrder sol = new StackPushPopOrder();
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 3, 5, 1, 2};
        Assert.assertFalse(sol.isPopOrder(push, pop));
    }

    @Test
    public void test04() {
        StackPushPopOrder sol = new StackPushPopOrder();
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {3, 5, 4, 1, 2};
        Assert.assertFalse(sol.isPopOrder(push, pop));
    }

    @Test
    public void test05() {
        StackPushPopOrder sol = new StackPushPopOrder();
        int[] push = {1};
        int[] pop = {2};
        Assert.assertFalse(sol.isPopOrder(push, pop));
    }

    @Test
    public void test06() {
        StackPushPopOrder sol = new StackPushPopOrder();
        int[] push = {1};
        int[] pop = {1};
        Assert.assertTrue(sol.isPopOrder(push, pop));
    }

    @Test
    public void test07() {
        StackPushPopOrder sol = new StackPushPopOrder();
        int[] push = null;
        int[] pop = null;
        Assert.assertTrue(sol.isPopOrder(push, pop));
    }
}
