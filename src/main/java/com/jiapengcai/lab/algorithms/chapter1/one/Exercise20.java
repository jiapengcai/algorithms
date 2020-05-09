package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author Jiapeng Cai
 * @date 2020/5/9 18:31
 */
public class Exercise20 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(ln(n));
    }

    private static double ln(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        return Math.log(n) + ln(n-1);
    }
}
