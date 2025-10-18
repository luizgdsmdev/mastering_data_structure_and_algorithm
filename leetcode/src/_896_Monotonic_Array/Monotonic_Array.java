package _896_Monotonic_Array;

//896. Monotonic Array
//Easy
//An array is monotonic if it is either monotone increasing or monotone decreasing.
//An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
//Given an integer array nums, return true if the given array is monotonic, or false otherwise.
//
//Example 1:
//Input: nums = [1,2,2,3]
//Output: true
//
//Example 2:
//Input: nums = [6,5,4,4]
//Output: true
//
//Example 3:
//Input: nums = [1,3,2]
//Output: false
//
//Constraints:
//1 <= nums.length <= 105
//-105 <= nums[i] <= 105

// -> Runtime: 8ms, beats 98.38% of submissions.
// -> Memory Usage: 59.57MB, beats 28.60% of submissions.

public class Monotonic_Array {
    public static boolean isMonotonic(int[] nums) {
        if(nums.length == 1) return true;
        if(nums.length == 2 && nums[0] == nums[1]) return true;

        int holder = nums[1] - nums[0];

        for(int i = 1; i < nums.length; i++){

            if(holder >= 1){
                if(nums[i] < (nums[i - 1]) ) return false;
            }else{
                if(nums[i] > (nums[i - 1])) return false;
            }
        }

        return true;
    }


    public static void main(String[] args){
        System.out.println(isMonotonic(new int[]{1,2,4,5}));
    }
}
