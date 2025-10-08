package _219_Contains_Duplicate_II;

//219. Contains Duplicate II
//Easy
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
//such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true
//
//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true
//
//Example 3:
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false
//
//Constraints:
//1 <= nums.length <= 105
//-109 <= nums[i] <= 109
//0 <= k <= 105

// -> Runtime: 0ms, beats 92.89% of submissions.
// -> Memory Usage: 59.56MB, beats 76.47% of submissions.

import java.util.HashMap;
import static java.lang.Math.abs;

public class Contains_Duplicate_II {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(abs(map.get(nums[i]) - i) <= k) return true;
                else map.put(nums[i], i);

            }else map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args){
        containsNearbyDuplicate(new int[]{1,2,2,2,2,1,3,1}, 3);

    }
}
