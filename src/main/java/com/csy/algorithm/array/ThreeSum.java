package com.csy.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 * 在一个给定整数数组中，找出所有不重复的三个数a,b,c。使a+b+c=0
 * For example, given array S = {-1 0 1 2 -1 -4},
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 * 方案：排序之后从第一个数开始遍历。三个数的下标分别记为start、mid、end。初始时，start=0，mid=start+1，end=length-1
 * 情况一：num[start]+num[mid]+num[end]>0。因为数组有序，则需要将和减小，即--end
 * 情况二：num[start]+num[mid]+num[end]=0。此时需要++mid，--end（++mid后和变大，--end后和变小）。如果num[++mid]=num[mid],则是重复值，舍弃。num[--end]=num[end]同理
 * 情况三：num[start]+num[mid]+num[end]<0。执行mid++
 * 当mid=end时，本轮循环结束，start+1开始下一轮
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, -1, 0, 1, -2, 2, 4, -3, 5, -10, 10};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int start = 0; start <= nums.length - 3; start++) {
            if (start != 0 && nums[start] == nums[start - 1]) {
                continue;
            }
            int mid = start + 1, end = nums.length - 1;
            while (mid < end) {
                int sum = nums[start] + nums[mid] + nums[end];
                if (sum > 0) {
                    end--;
                } else if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[start]);
                    temp.add(nums[mid]);
                    temp.add(nums[end]);
                    list.add(temp);
                    while (++mid < end && nums[mid] == nums[mid - 1]) ;
                    while (--end > mid && nums[end + 1] == nums[end]) ;
                } else {
                    mid++;
                }
            }
        }
        return list;
    }
}
