package _283_Move_Zeroes;

//283. Move Zeroes
//Easy
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//
//Example 2:
//Input: nums = [0]
//Output: [0]
//
//Constraints:
//1 <= nums.length <= 104
//-231 <= nums[i] <= 231 - 1
//
//Follow up: Could you minimize the total number of operations done?

// -> Runtime: 0ms, beats 96.67% of submissions.
// -> Memory Usage: 46.05MB, beats 79.94% of submissions.

import java.util.Arrays;

public class Move_Zeroes {

    public static void moveZeroes(int[] nums) {
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[z++] = nums[i];
            }
        }
        while (z < nums.length) {
            nums[z++] = 0;
        }

        System.out.println(Arrays.toString(nums));


    }

    public static void main(String[] args){

        moveZeroes(new int[]{1,0,1});

    }
}
