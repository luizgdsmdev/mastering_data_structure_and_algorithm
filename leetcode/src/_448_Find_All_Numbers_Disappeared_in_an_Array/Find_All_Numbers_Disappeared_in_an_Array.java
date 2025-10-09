package _448_Find_All_Numbers_Disappeared_in_an_Array;

//448. Find All Numbers Disappeared in an Array
//Easy
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//
//Example 2:
//Input: nums = [1,1]
//Output: [2]
//
//Constraints:
//n == nums.length
//1 <= n <= 105
//1 <= nums[i] <= n
//
//Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

// -> Runtime: 0ms, beats 99.55% of submissions.
// -> Memory Usage: 56.39MB, beats 87.09% of submissions.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] map = new int[nums.length];
        List<Integer> output = new ArrayList<>();

        for(int num: nums) map[num - 1] = num;
        System.out.println(Arrays.toString(map));
        for(int i = 0; i < map.length; i++) if(map[i] == 0) output.add(i + 1);

        return output;
    }

    public static void main(String[] args){
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,2,2,3,1}));
    }
}
