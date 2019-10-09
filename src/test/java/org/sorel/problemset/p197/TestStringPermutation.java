package org.sorel.problemset.p197;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestStringPermutation {
    @Test
    public void test() {
        test01();
        test02();
        test03();
        test04();
    }

    @Test
    public void test01() {
        StringPermutation sol = new StringPermutation();
        String org = "";
        List<String> res = sol.permutation(org);
        Assert.assertNull(res);
    }

    @Test
    public void test02() {
        StringPermutation sol = new StringPermutation();
        String org = "a";
        List<String> res = sol.permutation(org);
        for (String item : res) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @Test
    public void test03() {
        StringPermutation sol = new StringPermutation();
        String org = "ab";
        List<String> res = sol.permutation(org);
        for (String item : res) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @Test
    public void test04() {
        StringPermutation sol = new StringPermutation();
        String org = "abc";
        List<String> res = sol.permutation(org);
        for (String item : res) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
