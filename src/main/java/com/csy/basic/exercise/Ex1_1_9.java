package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/5.
 */

/**
 * 把一个正整数N转化成二进制表示的字符串
 */
public class Ex1_1_9 {
    public static String conv(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = n % 2 + s;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(conv(123));

    }
}
