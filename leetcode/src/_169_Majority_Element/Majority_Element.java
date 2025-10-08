package _169_Majority_Element;

//169. Majority Element
//Easy
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Example 1:
//Input: nums = [3,2,3]
//Output: 3
//
//Example 2:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//Constraints:
//n == nums.length
//1 <= n <= 5 * 104
//-109 <= nums[i] <= 109
//
//Follow-up: Could you solve the problem in linear time and in O(1) space?

// -> Runtime: 0ms, beats 99.74% of submissions.
// -> Memory Usage: 53.10MB, beats 61.78% of submissions.

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int crr = nums[0];
        int count = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == crr) count++;
            else count--;

            if(count <= 0){
                crr = nums[i];
                count = 1;
            }
        }
        return crr;
    }


    public static void main(String[] args){
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

}
