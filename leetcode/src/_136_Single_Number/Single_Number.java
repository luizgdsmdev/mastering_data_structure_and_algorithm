package _136_Single_Number;

//136. Single Number
//Easy
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//Example 1:
//Input: nums = [2,2,1]
//Output: 1
//
//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4
//
//Example 3:
//Input: nums = [1]
//Output: 1
//
//
//Constraints:
//1 <= nums.length <= 3 * 104
//-3 * 104 <= nums[i] <= 3 * 104
//
//Each element in the array appears twice except for one element which appears only once.

// -> Runtime: 0ms, beats 99.87% of submissions.
// -> Memory Usage: 46.16MB, beats 62.47% of submissions.

public class Single_Number {

    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sum = 0;
        for(int num : nums) {
            sum ^= num;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
