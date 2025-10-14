package _674_Longest_Continuous_Increasing_Subsequence;

//674. Longest Continuous Increasing Subsequence
//Easy
//Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray).
//The subsequence must be strictly increasing.
//A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l],
//nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].
//
//Example 1:
//Input: nums = [1,3,5,4,7]
//Output: 3
//Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
//Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element 4.
//
//Example 2:
//Input: nums = [2,2,2,2,2]
//Output: 1
//Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
//increasing.
//
//Constraints:
//1 <= nums.length <= 104
//-109 <= nums[i] <= 109

// -> Runtime: 1ms, beats 99.64% of submissions.
// -> Memory Usage: 44.41MB, beats 72.03% of submissions.

public class Longest_Continuous_Increasing_Subsequence {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length == 1) return 1;
        int max = 0;
        int crr = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]) crr++;
            else crr = 1;
            max = Math.max(max, crr);
        }
        return max;
    }

    public static void main(String[] args){
//        findLengthOfLCIS(new int[]{3,1,5,3,2,1,7});
        findLengthOfLCIS(new int[]{2,2,2,2,2});
    }
}
