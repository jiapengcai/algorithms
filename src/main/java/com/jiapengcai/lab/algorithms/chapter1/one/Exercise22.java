package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author Jiapeng Cai
 * @date 2020/5/10 17:35
 */
public class Exercise22 {

    public static void main(String[] args) {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int key = 10;
        Arrays.sort(a);
        StdOut.printf("rank:%d\n", rank(key, a));
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 1);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        StdOut.printf("current lo:%3d, hi:%3d, depth:%3d\n", lo, hi, depth);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (a[mid] > key) {
            return rank(key, a, lo, mid - 1, ++depth);
        } else if (a[mid] < key) {
            return rank(key, a, mid + 1, hi, ++depth);
        } else {
            return mid;
        }
    }
}
