package _905_Sort_Array_By_Parity;

//905. Sort Array By Parity
//Easy
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//Return any array that satisfies this condition.
//
//Example 1:
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//
//Example 2:
//Input: nums = [0]
//Output: [0]
//
//Constraints:
//1 <= nums.length <= 5000
//0 <= nums[i] <= 5000

// -> Runtime: 0ms, beats 100% of submissions.
// -> Memory Usage: 45.16MB, beats 28.02% of submissions.

public class Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        int[] even = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for(int num: nums){
            if(num % 2 == 0){
                even[left] = num;
                left++;
            }else{
                even[right] = num;
                right--;
            }
        }
        return even;
    }

    public static void main(String[] args){
        sortArrayByParity(new int[]{3,1,2,4});
    }
}
