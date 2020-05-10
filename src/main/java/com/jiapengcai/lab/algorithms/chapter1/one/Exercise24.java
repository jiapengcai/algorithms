package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author Jiapeng Cai
 * @date 2020/5/10 19:02
 */
public class Exercise24 {

    public static void main(String[] args) {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        StdOut.println(euclid(p, q));
    }

    public static int euclid(int p, int q) {
        int n = p % q;
        if (n == 0) {
            return q;
        } else {
            return euclid(q, n);
        }
    }
}
