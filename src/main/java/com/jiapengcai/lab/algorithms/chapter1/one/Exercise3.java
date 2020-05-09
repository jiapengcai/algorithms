package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author Jiapeng Cai
 * @date 2020/5/6 21:56
 */
public class Exercise3 {

    public static void main(String[] args) {
        int arg0 = Integer.parseInt(args[0]);
        int arg1 = Integer.parseInt(args[1]);
        int arg2 = Integer.parseInt(args[2]);
        StdOut.println(arg0 == arg1 && arg1 == arg2);
    }
}
