package org.sorel.problemset.p168;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPushPopOrder {
    public boolean isPopOrder(int[] push, int[] pop) {
        if ((push == null && pop == null) || (push != null && push.length == 0 && pop.length == 0)) {
            return true;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        if (push != null && pop != null && push.length == pop.length) {
            int idx = 0;
            for (int value : push) {
                if (value != pop[idx]) {
                    stack.push(value);
                } else {
                    idx++;
                }
            }

            if (!stack.isEmpty()) {
                while (stack.peek() != null && stack.peek() == pop[idx]) {
                    stack.pop();
                    idx++;
                }
            }
        }
        return stack.isEmpty();
    }
}
