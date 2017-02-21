package com.csy.basic.exercise;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by csy on 2017/2/8.
 */
public class Ex_1_1_24 {
    public static int gcd(int a, int b) {
        System.out.println(a + "," + b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String s;
        while (!StdIn.isEmpty()) {
            s = StdIn.readLine();
            try {
                String[] ss = s.split(" ");
                int a = Integer.parseInt(ss[0]);
                int b = Integer.parseInt(ss[1]);
                System.out.println("结果是：" + gcd(a, b));
            } catch (Exception e) {
                System.out.println("输入错误");
                continue;
            }

        }
    }
}
