import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum{
//1. Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:

//Input: nums = [3,3], target = 6
//Output: [0,1]

//Constraints:
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.

//Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

//Runtime: 2ms - Beats: 98.90%
//Memory: 45.08MB - Beats: 47.80%


    public int[] twoSumFunction(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();
        dict.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++){
            if(dict.get(target - nums[i]) != null){
                return new int[]{dict.get(target - nums[i]), (int)i};
            }
            dict.put(nums[i], (int)i);
        }
        return new int[1];
    }


    public void main(String[] args){
        int[] case1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(this.twoSumFunction(case1, 26)));;
    }
}