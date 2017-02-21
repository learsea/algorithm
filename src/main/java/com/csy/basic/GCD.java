package com.csy.basic;

/**
 * Created by csy on 2017/2/8.
 */

/**
 * 辗转相除法求最大公约数greatest common divisor，即欧几里得算法
 */
public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
