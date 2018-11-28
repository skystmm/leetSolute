package com.skystmm.array;


/**
 * 581. Shortest Unsorted Continuous Subarray
 * Created by Administrator on 2017/11/2.
 */

public class ShortestUnsortedContinuousSubarray {
    /**
     * UAC time :28 ms beat:52.41%
     * @param nums
     * @return
     */
    public static int solution(int[] nums) {
        int n = nums.length, beg = -1, end = -2, min = nums[n-1], max =nums[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n-1-i]);
            if (nums[i] < max) end = i;
            if (nums[n-1-i] > min) beg = n-1-i;
        }
        return end - beg + 1;
    }


}
