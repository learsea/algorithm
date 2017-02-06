package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/5.
 */
public class Ex_1_1_20 {
    public static long ln(int N) {
        if (N == 1 || N == 0) {
            return 1;
        }
        return N * ln(N - 1);
    }

    public static long ln1(int N) {
        long p = 1;
        while (N != 1) {
            p *= N--;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(ln(20));
        System.out.println(ln1(20));

    }
}
