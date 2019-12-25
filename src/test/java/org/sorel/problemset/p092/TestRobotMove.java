package org.sorel.problemset.p092;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRobotMove {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
        test08();
        test09();
    }

    @Test
    public void test01() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(21, sol.movingCount(5, 10, 10));
    }

    @Test
    public void test02() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(359, sol.movingCount(15, 20, 20));
    }

    @Test
    public void test03() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(29, sol.movingCount(10, 1, 100));
    }

    @Test
    public void test04() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(10, sol.movingCount(10, 1, 10));
    }

    @Test
    public void test05() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(79, sol.movingCount(15, 100, 1));
    }

    @Test
    public void test06() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(10, sol.movingCount(15, 10, 1));
    }

    @Test
    public void test07() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(1, sol.movingCount(15, 1, 1));
    }

    @Test
    public void test08() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(1, sol.movingCount(0, 1, 1));
    }

    @Test
    public void test09() {
        RobotMove sol = new RobotMove();
        Assertions.assertEquals(0, sol.movingCount(-10, 10, 10));
    }
}