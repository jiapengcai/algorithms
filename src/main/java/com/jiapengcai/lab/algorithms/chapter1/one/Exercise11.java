package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author caijiapeng
 * @version created on 2020/5/7 18:29
 */
public class Exercise11 {

    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, false, true, false},
                {false, true, false, true},
        };
        printBooleanMatrix(matrix);
    }

    private static void printBooleanMatrix(boolean[][] matrix) {
        StdOut.print(" ");
        for (int i = 0; i < matrix[0].length; i++) {
            StdOut.print(" " + i);
        }
        StdOut.println();
        for (int i = 0; i < matrix.length; i++) {
            StdOut.print(i);
            for (int j = 0; j < matrix[0].length; j++) {
                StdOut.print(" " + (matrix[i][j] ? "*" : " "));
            }
            StdOut.println();
        }
    }
}
