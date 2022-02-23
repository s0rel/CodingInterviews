package org.sorel.problemset.p294;

import org.junit.jupiter.api.Test;

public class TestDicesProbability {
    @Test
    public void test() {
        DicesProbability sol = new DicesProbability();
        sol.printProbability(1);
        sol.printProbability(2);
        sol.printProbability(3);
        sol.printProbability(4);
        sol.printProbability(11);
        sol.printProbability(0);
    }
}
