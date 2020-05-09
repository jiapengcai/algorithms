package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author caijiapeng
 * @version created on 2020/5/8 11:07
 */
public class Exercise12 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(a[i]);
        }
    }
}
