package com.jiapengcai.lab.algorithms.chapter1.one;

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
        System.out.println(" ");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }
}
