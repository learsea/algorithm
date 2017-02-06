package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/5.
 */
public class Ex1_1_19 {

    //原始方法
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    //改进方法
    public static long Fib(int N) {
        //f储存f[0]-f[N]的值
        long[] f = new long[N + 1];
        return Fib(N, f);
    }

    public static long Fib(int N, long f[]) {
        if (f[N] != 0) {
            //如果f[N]计算过，则直接返回f[N]
            return f[N];
        } else {
            //f[N]没有计算过，计算f[N]的值
            if (N == 1) {
                f[N] = 1;
                return 1;
            }
            if (N == 0) {
                return 0;
            }
            f[N] = Fib(N - 1, f) + Fib(N - 2, f);
            return f[N];
        }
    }


    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println("F:" + F(30));
        long e1 = System.currentTimeMillis();
        System.out.println("F time :" + (e1 - s1));

        long s2 = System.currentTimeMillis();
        System.out.println("F:" + Fib(30));
        long n2 = System.currentTimeMillis();
        System.out.println("F time :" + (n2 - s2));


    }
}
