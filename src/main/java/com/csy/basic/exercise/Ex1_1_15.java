package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/5.
 */
public class Ex1_1_15 {
    public static int[] histogram(int[] a, int M) {
        int[] r = new int[M];
        for (int i = 0; i < a.length; i++) {
            r[a[i]]++;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 2, 4, 5, 2, 1, 2, 4, 5, 6, 10, 4, 5, 10, 3, 3, 1, 3, 4, 5};
        int[] b = histogram(a, a.length);
        for (int i : b) {
            System.out.printf("%-3d",i);
        }
    }
}
