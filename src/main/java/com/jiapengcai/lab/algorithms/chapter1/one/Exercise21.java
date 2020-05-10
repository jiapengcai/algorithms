package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author Jiapeng Cai
 * @date 2020/5/9 18:45
 */
public class Exercise21 {

    public static void main(String[] args) {
        StdOut.print("How many students? ");
        int n = StdIn.readInt();
        StdOut.println("input student's name, first score and second score:");
        String[] nameList = new String[n];
        int[] firstScoreList = new int[n];
        int[] secondScoreList = new int[n];
        for (int i = 0; i < n; i++) {
            nameList[i] = StdIn.readString();
            firstScoreList[i] = StdIn.readInt();
            secondScoreList[i] = StdIn.readInt();
        }
        StdOut.println("Input Done!");
        for (int i = 0; i < n; i++) {
            StdOut.printf("name:%-10s, first score:%4d, second score:%4d\n", nameList[i], firstScoreList[i], secondScoreList[i]);
        }
    }
}
