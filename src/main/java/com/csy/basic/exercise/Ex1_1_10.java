package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/5.
 */
public class Ex1_1_10 {
    public static void print(boolean[][] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] ? "*" : " ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        boolean[][] b = new boolean[][]{{true, false,true, false}, {false, true, true}, {false, false, false}, {true, true, true}};
        print(b);
    }
}
