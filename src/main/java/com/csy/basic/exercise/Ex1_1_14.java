package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/5.
 */
public class Ex1_1_14 {
    public static int lg(int N) {
        for (int i = 1; i <= N; i++) {
            int p = 2;
            for (int j = 1; j < i; j++) {
                p *= 2;
            }
            if (p > N) {
                return i - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(lg(2));
    }
}
