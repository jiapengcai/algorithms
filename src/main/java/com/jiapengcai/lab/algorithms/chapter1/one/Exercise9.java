package com.jiapengcai.lab.algorithms.chapter1.one;

/**
 * @author caijiapeng
 * @version created on 2020/5/7 18:23
 */
public class Exercise9 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        a(n);
        b(n);
    }

    private static void a(int n) {
        System.out.println(Integer.toBinaryString(n));
    }

    private static void b(int n) {
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    }
}
