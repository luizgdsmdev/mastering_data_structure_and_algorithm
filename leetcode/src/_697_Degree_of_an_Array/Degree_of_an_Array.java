package _697_Degree_of_an_Array;

//697. Degree of an Array
//Easy
//Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
//Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
//
//Example 1:
//Input: nums = [1,2,2,3,1]
//Output: 2
//Explanation:
//The input array has a degree of 2 because both elements 1 and 2 appear twice.
//Of the subarrays that have the same degree:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//The shortest length is 2. So return 2.
//
//Example 2:
//Input: nums = [1,2,2,3,1,4,2]
//Output: 6
//Explanation:
//The degree is 3 because the element 2 is repeated 3 times.
//So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
//
//Constraints:
//nums.length will be between 1 and 50,000.
//nums[i] will be an integer between 0 and 49,999.

// -> Runtime: 26ms, beats 48.92% of submissions.
// -> Memory Usage: 47.38MB, beats 64.79% of submissions.

import java.util.*;

public class Degree_of_an_Array {

    public static int findShortestSubArray(int[] nums) {
        if(nums.length <= 1) return 1;
        Map<Integer, int[]> map = new HashMap<>();
        int num = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i])[0] = map.get(nums[i])[0] + 1;
                map.get(nums[i])[2] = i;
            }else map.put(nums[i], new int[]{1,i, i});

            if(map.get(nums[i])[0] > max){
                max = map.get(nums[i])[0];
                num = nums[i];
            }else if(map.get(nums[i])[0] == max){
                num = map.get(num)[2] - map.get(num)[1] + 1 < map.get(nums[i])[2] - map.get(nums[i])[1] + 1 ? num : nums[i];
            }
        }

        return map.get(num)[2] - map.get(num)[1] + 1;
    }

    public static void main(String[] args){
        findShortestSubArray(new int[]{2,1});
    }
}
