package _704_Binary_Search;

//704. Binary Search
//Easy
//Given an array of integers nums which is sorted in ascending order, and an integer target,
//write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.
//
//Example 1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//
//Example 2:
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
//
//Constraints:
//1 <= nums.length <= 104
//-104 < nums[i], target < 104
//All the integers in nums are unique.
//nums is sorted in ascending order.

// -> Runtime: 0ms, beats 100% of submissions.
// -> Memory Usage: 45.60MB, beats 71.61% of submissions.

public class Binary_Search {
    public static int search(int[] nums, int target) {

        int max = nums.length - 1;
        int min = 0;

        while(min <= max){
            int mid = min + (max - min)/2;
            if(nums[mid] == target) return mid;

            if(nums[mid] < target) min = mid + 1;
            else max = mid - 1;
        }
        return -1;
    }


    public static void main(String[] args){
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 12));
    }
}
