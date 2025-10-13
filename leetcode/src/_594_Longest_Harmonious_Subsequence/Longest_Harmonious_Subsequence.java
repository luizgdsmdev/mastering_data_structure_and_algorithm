package _594_Longest_Harmonious_Subsequence;

//594. Longest Harmonious Subsequence Easy
//We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
//Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
//
//Example 1:
//Input: nums = [1,3,2,2,5,2,3,7]
//Output: 5
//Explanation:
//The longest harmonious subsequence is [3,2,2,2,3].
//
//Example 2:
//Input: nums = [1,2,3,4]
//Output: 2
//Explanation:
//The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.
//
//Example 3:
//Input: nums = [1,1,1,1]
//Output: 0
//Explanation:
//No harmonic subsequence exists.
//
//Constraints:
//1 <= nums.length <= 2 * 104
//-109 <= nums[i] <= 109

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_Harmonious_Subsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int out = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.containsKey(num - 1)) out = Math.max(out, map.get(num) + map.get(num - 1));
            if (map.containsKey(num + 1)) out = Math.max(out, map.get(num) + map.get(num + 1));
        }

        return out;

//        Solution 1
//        Map<Integer, Integer> map = new HashMap<>(nums.length);
//        for(int i = 0; i < nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        if(map.size() == 1) return 0;
//
//        int out = 0;
//        for(int key: map.keySet()){
//            if (map.containsKey(key + 1)) {
//                out = Math.max(out, map.get(key) + map.get(key + 1));
//            }
//        }
//
//        return out;
    }

    public static void main(String[] args){
        findLHS(new int[]{1,2,3,4});
    }
}
