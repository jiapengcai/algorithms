package com.jiapengcai.lab.algorithms.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author caijiapeng
 * @version created on 2020/5/8 11:10
 */
public class Exercise13 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        print2DMatrix(matrix);
        StdOut.println("------------------------------");
        int[][] invertMatrix = invert(matrix);
        print2DMatrix(invertMatrix);
    }

    private static int[][] invert(int[][] matrix) {
        int columnLength = matrix[0].length;
        int rowLength = matrix.length;
        int[][] invertMatrix = new int[columnLength][rowLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                invertMatrix[j][i] = matrix[i][j];
            }
        }
        return invertMatrix;
    }

    private static void print2DMatrix(int[][] matrix) {
        int columnLength = matrix[0].length;
        for (int[] rows : matrix) {
            for (int j = 0; j < columnLength; j++) {
                StdOut.print(rows[j] + " ");
            }
            StdOut.println();
        }
    }
}
