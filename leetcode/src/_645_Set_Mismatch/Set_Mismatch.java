package _645_Set_Mismatch;

//645. Set Mismatch
//Easy
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
//one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//Example 1:
//Input: nums = [1,2,2,4]
//Output: [2,3]
//
//Example 2:
//Input: nums = [1,1]
//Output: [1,2]
//
//Constraints:
//2 <= nums.length <= 104
//1 <= nums[i] <= 104

// -> Runtime: 12ms, beats 30.43% of submissions.
// -> Memory Usage: 46.02MB, beats 19.35% of submissions.

import java.util.Arrays;

public class Set_Mismatch {

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] output = new int[2];

        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] == nums[i]) output[0] = nums[i];
            if (nums[i - 1] + 1 != nums[i] && output[1] == 0) output[1] = nums[i - 1] + 1;
        }
        if (output[1] == 0){
            if (nums[0] != 1) output[1] = 1;
            else if (nums[nums.length - 1] != nums.length) output[1] = nums.length;
        }
        return output;




//        Solution 1
//        Set<Integer> set = new HashSet<>();
//        int[] output = new int[2];
//        for(int num: nums){
//            if(set.contains(num)) output[0] = num;
//            else set.add(num);
//        }
//
//        for(int i = 0; i < set.size(); i++){
//            if(!set.contains(i + 1)){
//                output[1] = i + 1;
//                break;
//            }
//        }
//        return output;
    }

    public static void main(String[] args){
        findErrorNums(new int[]{1, 2, 2, 3});
    }
}
