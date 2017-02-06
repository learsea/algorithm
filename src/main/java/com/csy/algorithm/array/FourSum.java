package com.csy.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/19.
 * 在给定数组中找到四个数a,b,c,d，是a+b+c+d = target,重复的四个数只算一次
 * 和3个数类似，多一层循环
 */
public class FourSum {

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{2, 3, 6, 1, 43, 2, 1, -1, 1, 3, -1}, 5));
//        System.out.println(fourSum(new int[]{-1, -1, -1, -1}, -4));
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return null;
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.print(i + "   ");
        }
        System.out.println();
        for (int a = 0; a <= nums.length - 4; a++) {
            //去重
            if (a != 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            //下面就是三个数的算法，b+c+d = target-a
            int tempTarget = target - nums[a];
            for (int b = a + 1; b <= nums.length - 3; b++) {
                //去重,注意，不能判断第一个b是否等于b-1，因为当b=a+1(第一个b)时，b-1是a，而不是本次循环中的b
                if (b != a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }
                int c = b + 1;
                int d = nums.length - 1;
                while (c < d) {
                    if (nums[b] + nums[c] + nums[d] < tempTarget) {
                        c++;
                    } else if (nums[b] + nums[c] + nums[d] == tempTarget) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[a]);
                        temp.add(nums[b]);
                        temp.add(nums[c]);
                        temp.add(nums[d]);
                        list.add(temp);
                        //去重
                        while (++c < d && nums[c] == nums[c - 1]) ;
                        while (c < --d && nums[d] == nums[d + 1]) ;
                    } else {
                        d--;
                    }
                }
            }
        }
        return list;
    }
}
