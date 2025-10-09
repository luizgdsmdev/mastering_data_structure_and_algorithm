package _414_Third_Maximum_Number;

//414. Third Maximum Number
//Easy
//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist,
//return the maximum number.
//
//Example 1:
//Input: nums = [3,2,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2.
//The third distinct maximum is 1.
//
//Example 2:
//Input: nums = [1,2]
//Output: 2
//Explanation:
//The first distinct maximum is 2.
//The second distinct maximum is 1.
//The third distinct maximum does not exist, so the maximum (2) is returned instead.
//
//Example 3:
//Input: nums = [2,2,3,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//The third distinct maximum is 1.
//
//Constraints:
//1 <= nums.length <= 104
//-231 <= nums[i] <= 231 - 1
//
//Follow up: Can you find an O(n) solution?

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Third_Maximum_Number {

    public static int thirdMax(int[] nums) {
        if(nums.length == 1) return nums[0];
        TreeSet<Integer> tree = new TreeSet<>(Comparator.reverseOrder());

        for(int num: nums) tree.add(num);

        if(tree.size() == 3) return tree.first();
        if(tree.size() < 3) return tree.last();

        while(tree.size() > 3){
            tree.removeLast();
        }

        return tree.last();
    }



    public static void main(String[] args){
        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }
}
