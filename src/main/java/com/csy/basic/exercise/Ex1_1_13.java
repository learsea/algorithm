package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/5.
 */
public class Ex1_1_13 {
    public static int[][] converse(int[][] src) {
        int[][] r = new int[src[0].length][src.length];
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src[i].length; j++) {
                r[j][i] = src[i][j];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {5, 22, 34}, {12, 54, 2}, {1, 44, 23}};
        int[][] b = converse(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%-5d", b[i][j]);
            }
            System.out.println();
        }
    }
}
