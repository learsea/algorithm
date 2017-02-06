package com.csy.basic;

/**
 * Created by csy on 2017/2/4.
 */
public class BinarySearch {
    //待查找的数组必须是有序的
    public static int find(int k, int[] src) {
        int lo = 0;
        int hi = src.length - 1;
        while (lo <= hi) {
            //二分查找每次都取中间值进行比较
            int mid = lo + (hi - lo) / 2;
            if (k < src[mid]) {
                hi = mid - 1;
            } else if (k == src[mid]) {
                return mid;
            } else {
                lo = mid + 1;
            }
        }
        //没有找到返回-1
        return -1;
    }

    //递归版本
    public static int find1(int k, int[] src) {
        return find1(k, src, 0, src.length - 1);
    }

    public static int find1(int k, int[] src, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (k < src[mid]) {
            return find1(k, src, lo, mid - 1);
        } else if (k == src[mid]) {
            return mid;
        } else {
            return find1(k, src, mid + 1, hi);
        }
    }

    public static int find2(int k, int[] src) {
        for (int i = 0; i < src.length; i++) {
            if (k == src[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
