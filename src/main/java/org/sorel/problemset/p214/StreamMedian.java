package org.sorel.problemset.p214;

import java.util.Map;
import java.util.TreeMap;

public class StreamMedian {
    private TreeMap<Integer, Integer> map = new TreeMap<>();

    public void insert(Integer num) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    public double getMedian() {
        int size = map.size();
        Map.Entry<Integer, Integer> entry = map.firstEntry();
        int idx = entry.getValue();
        int mid = (size + 1) / 2;
        while (idx < mid) {
            entry = map.higherEntry(entry.getKey());
            idx += entry.getValue();
        }
        if (size % 2 == 0 && idx == mid) {
            return (entry.getKey() + map.higherEntry(entry.getKey()).getKey()) / 2.0;
        }
        return (double) entry.getKey();
    }
}
