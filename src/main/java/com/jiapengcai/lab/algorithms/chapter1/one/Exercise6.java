package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author caijiapeng
 * @version created on 2020/5/7 17:55
 */
public class Exercise6 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i=0; i<=15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
