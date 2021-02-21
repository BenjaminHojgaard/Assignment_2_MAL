package com.company;

public class Main {

    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(0, 5);
        quickUnion.union(6, 8);
        quickUnion.union(7, 8);
        quickUnion.union(0, 6);
        System.out.println(quickUnion.find(5));
        System.out.println(quickUnion.find(8));
        System.out.println(quickUnion.count());
        System.out.println(quickUnion.connected(0, 7));
        System.out.println(quickUnion.connected(0, 3));

        System.out.println(quickUnion.toString());

        WeightedQuickUnion wquickUnion = new WeightedQuickUnion(10);
        wquickUnion.union(0, 5);
        wquickUnion.union(6, 8);
        wquickUnion.union(7, 8);
        wquickUnion.union(0, 6);
        System.out.println(wquickUnion.find(5));
        System.out.println(wquickUnion.find(8));
        System.out.println(wquickUnion.count());
        System.out.println(wquickUnion.connected(0, 7));
        System.out.println(wquickUnion.connected(0, 3));

        System.out.println(wquickUnion.toString());
    }
}
