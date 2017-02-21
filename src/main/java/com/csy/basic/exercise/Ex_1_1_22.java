package com.csy.basic.exercise;

/**
 * Created by csy on 2017/2/8.
 */
public class Ex_1_1_22 {
    public static int search(int k, int[] a) {
        return search(k, a, 0, a.length - 1, 1);
    }

    public static int search(int k, int[] a, int lo, int hi, int deep) {
        for (int i = 1; i < deep; i++) {
            System.out.print(" ");
        }
        System.out.print("low:" + lo + ",high:" + hi + "\n");
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (k < a[mid]) {
            return search(k, a, lo, mid - 1, deep + 1);
        } else if (k > a[mid]) {
            return search(k, a, mid + 1, hi, deep + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] src = new int[]{1, 6, 8, 9, 11, 24, 33, 36, 37, 38, 54, 443, 2222, 4442, 124667};
        int k = 37;
        System.out.println(search(k, src));
    }
}
