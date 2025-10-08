package _217_Contains_Duplicate;

//217. Contains Duplicate
//Easy
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
//element is distinct.
//
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation:
//The element 1 occurs at the indices 0 and 3.
//
//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//Explanation:
//All elements are distinct.
//
//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
//
//Constraints:
//1 <= nums.length <= 105
//-109 <= nums[i] <= 109

// -> Runtime: 0ms, beats 41.09% of submissions.
// -> Memory Usage: 62.58MB, beats 5.42% of submissions.


import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>(nums.length);
        for(int num: nums){
            if(map.contains(num)) return true;
            else map.add(num);
        }
        return false;
    }


    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{2,3,3}));;
    }
}
