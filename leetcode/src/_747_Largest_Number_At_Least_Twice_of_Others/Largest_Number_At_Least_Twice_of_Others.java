package _747_Largest_Number_At_Least_Twice_of_Others;

//747. Largest Number At Least Twice of Others
//Easy
//You are given an integer array nums where the largest integer is unique.
//Determine whether the largest element in the array is at least twice as much as every other number in the array.
//If it is, return the index of the largest element, or return -1 otherwise.
//
//Example 1:
//Input: nums = [3,6,1,0]
//Output: 1
//Explanation: 6 is the largest integer.
//For every other number in the array x, 6 is at least twice as big as x.
//The index of value 6 is 1, so we return 1.
//
//Example 2:
//Input: nums = [1,2,3,4]
//Output: -1
//Explanation: 4 is less than twice the value of 3, so we return -1.
//
//Constraints:
//2 <= nums.length <= 50
//0 <= nums[i] <= 100
//The largest element in nums is unique.

// -> Runtime: 0ms, beats 100% of submissions.
// -> Memory Usage: 41.19MB, beats 97.99% of submissions.

public class Largest_Number_At_Least_Twice_of_Others {
    public static int dominantIndex(int[] nums) {
        int one = -1;
        int two = -1;
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > one){
                two = one;
                one = nums[i];
                index = i;
            }else if(nums[i] > two) two = nums[i];
        }

        if(two * 2 > one) return -1;
        else return index;
    }

    public static void main(String[] args){
        System.out.println(dominantIndex(new int[]{0,0,3,2}));
    }
}
