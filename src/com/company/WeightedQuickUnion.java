package com.company;

import java.util.Arrays;

public class WeightedQuickUnion implements UnionFind {

    private final int[] numbers;
    private final int[] setSize;
    private final int size;
    private int count = 0;

    public WeightedQuickUnion(int size) {
        this.size = size;
        numbers = new int[size];
        setSize = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i;
            setSize[i] = 1;
        }
        count = size;
    }

    @Override
    public void union(int p, int q) {

        if (!connected(p, q)) {

            var pVal = find(p);
            var qVal = find(q);

            if (setSize[pVal] < setSize[qVal]) {
                numbers[pVal] = qVal;
                setSize[qVal] += setSize[pVal];
            } else {
                numbers[qVal] = pVal;
                setSize[pVal] += setSize[qVal];
            }
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
        return Arrays.toString(numbers) + "\n" + Arrays.toString(setSize);
    }

}
