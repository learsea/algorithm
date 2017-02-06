package com.csy.algorithm.array;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/17.
 * 给一个整数数组和一个目标值，找到三个数的和，使这三个数的和最接近目标值
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{10, 1, 1, -1}, 2));
    }

    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return Integer.MIN_VALUE;
        }
        int result = 0;
        int abs = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int start = 0; start < nums.length - 2; start++) {
            int mid = start + 1, end = nums.length - 1;
            while (mid < end) {
                int sum = nums[start] + nums[mid] + nums[end];
                //两个数相减的绝对值就是两个数的差距
                int absTemp = Math.abs(sum - target);
                if (absTemp - abs < 0) {
                    abs = absTemp;
                    result = abs;
                }
                if (sum == target) {
                    return result;
                } else if (sum < target) {
                    mid++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
