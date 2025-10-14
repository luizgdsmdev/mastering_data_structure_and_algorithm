package _643_Maximum_Average_Subarray_I;

//643. Maximum Average Subarray I
//Easy
//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
//Any answer with a calculation error less than 10-5 will be accepted.
//
//Example 1:
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
//
//Example 2:
//Input: nums = [5], k = 1
//Output: 5.00000
//
//Constraints:
//n == nums.length
//1 <= k <= n <= 105
//-104 <= nums[i] <= 104

// -> Runtime: 2ms, beats 99.91% of submissions.
// -> Memory Usage: 55.15MB, beats 99.75% of submissions.

public class Maximum_Average_Subarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) return (double) nums[0];
        if (nums.length == k) {
            int sum = 0;
            for (int num : nums) sum += num;
            return (double) sum / k;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        int maxSum = sum;

        for (int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }


    public static void main(String[] args){
        findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
    }
}
