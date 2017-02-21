package com.csy.basic;

/**
 * Created by csy on 2017/2/4.
 */

/**
 * 二分查找
 */
public class BinarySearch {
    //待查找的数组必须是有序的
    public static int search(int k, int[] src) {
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
    public static int search1(int k, int[] src) {
        return search1(k, src, 0, src.length - 1);
    }

    public static int search1(int k, int[] src, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (k < src[mid]) {
            return search1(k, src, lo, mid - 1);
        } else if (k == src[mid]) {
            return mid;
        } else {
            return search1(k, src, mid + 1, hi);
        }
    }

    public static void main(String[] args) {
        int[] src = new int[]{1, 6, 8, 9, 11, 24, 33, 36, 37, 38, 54, 443, 2222, 4442, 124667};
        int k = 37;
        System.out.println(search1(k, src));
    }
}
