package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author Jiapeng Cai
 * @date 2020/5/6 22:00
 */
public class Exercise5 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        StdOut.println(x > 0.0 && x < 1.0 && y > 0.0 && y < 1.0);
    }
}
