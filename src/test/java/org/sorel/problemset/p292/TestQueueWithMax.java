package org.sorel.problemset.p292;

import org.junit.Assert;
import org.junit.Test;

public class TestQueueWithMax {
    @Test
    public void test() {
        QueueWithMax<Integer> queue = new QueueWithMax<>();
        queue.pushBack(2);
        Assert.assertEquals(Integer.valueOf(2), queue.max());

        queue.pushBack(3);
        Assert.assertEquals(Integer.valueOf(3), queue.max());

        queue.pushBack(4);
        Assert.assertEquals(Integer.valueOf(4), queue.max());

        queue.pushBack(2);
        Assert.assertEquals(Integer.valueOf(4), queue.max());

        queue.popFront();
        Assert.assertEquals(Integer.valueOf(4), queue.max());

        queue.popFront();
        Assert.assertEquals(Integer.valueOf(4), queue.max());

        queue.popFront();
        Assert.assertEquals(Integer.valueOf(2), queue.max());

        queue.pushBack(6);
        Assert.assertEquals(Integer.valueOf(6), queue.max());

        queue.pushBack(2);
        Assert.assertEquals(Integer.valueOf(6), queue.max());

        queue.pushBack(5);
        Assert.assertEquals(Integer.valueOf(6), queue.max());

        queue.popFront();
        Assert.assertEquals(Integer.valueOf(6), queue.max());

        queue.popFront();
        Assert.assertEquals(Integer.valueOf(5), queue.max());

        queue.popFront();
        Assert.assertEquals(Integer.valueOf(5), queue.max());

        queue.pushBack(1);
        Assert.assertEquals(Integer.valueOf(5), queue.max());
    }
}
