package com.company;

import java.util.Arrays;

public class QuickUnion implements UnionFind{

    private final int[] numbers;
    private final int size;
    private int count = 0;

    public QuickUnion(int size) {
        this.size = size;
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }
        count = size;
    }

    @Override
    public void union(int p, int q) {
        if (!connected(p, q)) {
            var pVal = find(p);
            var qVal = find(q);
            numbers[pVal] = qVal;
            count--;
        }

    }

    @Override
    public int find(int p) {
        while (p != numbers[p]){
            p = numbers[p];
        }
        return numbers[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return numbers[find(p)] == numbers[find(q)];
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
