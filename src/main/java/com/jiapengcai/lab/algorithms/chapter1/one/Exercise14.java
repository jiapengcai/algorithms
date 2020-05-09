package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author caijiapeng
 * @version created on 2020/5/9 14:22
 */
public class Exercise14 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(lg(n));
    }

    private static int lg(int n) {
        int count = 0;
        int m = n / 2;
        while (m > 0) {
            count++;
            m = m / 2;
        }
        return count;
    }
}
