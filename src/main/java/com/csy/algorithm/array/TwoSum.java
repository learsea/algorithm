package com.csy.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/13.
 * 从一个数组中找到两个数组，使其和等于target（假设只有一组解）
 * 方案：按照key=num[i],value=i存在map中
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {


    public static void main(String[] args) {
        int[] nums = {20, 12, 13,20,102,223,19,2};
        int result[] = twoSum(nums, 225);
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            //map.get(nums[v]) = v,target-nums[i] = nums[v]
            Integer v = map.get(target - nums[i]);
            // can't use itself
            if (v != null && v != i) {
                return new int[]{i + 1, v + 1};
            }
        }
        return null;
    }
}
