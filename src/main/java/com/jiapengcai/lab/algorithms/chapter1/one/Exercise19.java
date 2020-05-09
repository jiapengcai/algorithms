package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author Jiapeng Cai
 * @date 2020/5/9 17:01
 */
public class Exercise19 {

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + fibonacci(N));
        }
        StdOut.println("----------------------------");
        long[] results = fibonacci2(100);
        for (int N = 0; N < 100; N++) {
            StdOut.println(results[N]);
        }
    }

    public static long fibonacci(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    public static long[] fibonacci2(int N) {
        long[] results = new long[N];
        results[0] = 0;
        if (N >= 1) {
            results[1] = 1;
        }
        for (int i = 2; i < N; i++) {
            results[i] = results[i-1] + results[i-2];
        }
        return results;
    }
}
