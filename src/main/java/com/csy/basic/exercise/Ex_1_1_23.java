package com.csy.basic.exercise;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by csy on 2017/2/8.
 */
public class Ex_1_1_23 {
    public static void search(int k, int[] a, char c) {
        int i = search(k, a, 0, a.length - 1);
        if (c == '+') {
            if (i < 0) {
                System.out.println(k);
            }
        } else if (c == '-') {
            if (i >= 0) {
                System.out.println(k);
            }
        }
    }

    public static int search(int k, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (k < a[mid]) {
            return search(k, a, lo, mid - 1);
        } else if (k > a[mid]) {
            return search(k, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] src = new int[]{1, 6, 8, 9, 11, 24, 33, 36, 37, 38, 54, 443, 2222, 4442, 124667};
        while (!StdIn.isEmpty()) {
            int k = StdIn.readInt();
            System.out.print("+:");
            search(k, src, '+');
            System.out.println();
            System.out.print("-:");
            search(k, src, '-');
            System.out.println();
        }
    }
}
