package com.csy.basic.exercise;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by csy on 2017/2/8.
 */
public class Ex_1_1_21 {
    public static void main(String[] args) {
        String line;
        while (!(line = StdIn.readLine()).equals("exit")) {
            String[] s = line.split(" ");
            String word;
            float a, b;
            try {
                word = s[0];
                a = Float.parseFloat(s[1]);
                b = Float.parseFloat(s[2]);
            } catch (Exception e) {
                System.out.println("输入有误，请重新输入");
                continue;
            }
            System.out.printf("%s %.0f %.0f %.3f\n", word, a, b, a / b);
        }
    }
}
