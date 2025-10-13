package _628_Maximum_Product_of_Three_Numbers;

//628. Maximum Product of Three Numbers
//Easy
//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//Example 1:
//Input: nums = [1,2,3]
//Output: 6
//
//Example 2:
//Input: nums = [1,2,3,4]
//Output: 24
//
//Example 3:
//Input: nums = [-1,-2,-3]
//Output: -6
//
//Constraints:
//3 <= nums.length <= 104
//-1000 <= nums[i] <= 1000

import java.util.Arrays;
import java.util.Collections;

// -> Runtime: 2ms, beats 98.86% of submissions.
// -> Memory Usage: 45.38MB, beats 94.97% of submissions.

public class Maximum_Product_of_Three_Numbers {

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }

    public static void main(String[] args){
        System.out.println(maximumProduct(new int[]{1,2,3,-3}));
    }
}
