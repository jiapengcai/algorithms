package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author caijiapeng
 * @version created on 2020/5/9 15:41
 */
public class Exercise15 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 3, 2, 2, 6};
        int[] b = histogram(a, 6);
        printList(b);
    }

    private static int[] histogram(int[] a, int m) {
        int[] b = new int[m];
        for (int i : a) {
            b[i - 1] = b[i - 1] + 1;
        }
        return b;
    }

    private static void printList(int[] a) {
        for (int i : a) {
            StdOut.print(i + " ");
        }
        StdOut.println();
    }
}
