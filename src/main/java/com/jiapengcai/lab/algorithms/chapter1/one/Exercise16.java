package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author caijiapeng
 * @version created on 2020/5/9 16:13
 */
public class Exercise16 {

    public static void main(String[] args) {
        StdOut.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
