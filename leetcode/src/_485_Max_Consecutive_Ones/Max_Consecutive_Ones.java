package _485_Max_Consecutive_Ones;

//485. Max Consecutive Ones
//Easy
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//Example 1:
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//
//Example 2:
//Input: nums = [1,0,1,1,0,1]
//Output: 2
//
//Constraints:
//1 <= nums.length <= 105
//nums[i] is either 0 or 1.

// -> Runtime: 0ms, beats 95.38% of submissions.
// -> Memory Usage: 50.06MB, beats 79.58% of submissions.

public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int output = 0;
        int crr = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) crr++;
            else {
                output = Math.max(crr, output);
                crr = 0;
            }
        }

        return Math.max(crr, output);
    }

    public static void main(String[] args){

        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));

    }
}
