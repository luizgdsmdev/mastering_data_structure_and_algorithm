package _303_Range_Sum_Query_Immutable;

//303. Range Sum Query - Immutable
//Easy
//Given an integer array nums, handle multiple queries of the following type:
//Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
//Implement the NumArray class:
//
//NumArray(int[] nums) Initializes the object with the integer array nums.
//int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
//
//Example 1:
//Input
//["NumArray", "sumRange", "sumRange", "sumRange"]
//[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
//Output
//[null, 1, -1, -3]
//
//Explanation
//NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
//numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
//numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
//numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
//
//Constraints:
//1 <= nums.length <= 104
//-105 <= nums[i] <= 105
//0 <= left <= right < nums.length
//At most 104 calls will be made to sumRange.

// -> Runtime: 0ms, beats 100% of submissions.
// -> Memory Usage: 49.36MB, beats 75.59% of submissions.

public class Range_Sum_Query_Immutable {
    static int[] ind;
    public static void NumArray(int[] nums) {
        ind = new int[nums.length + 1];
        ind[0] = 0;
        for(int i = 0; i < nums.length; i++){
            ind[i + 1] = ind[i] + nums[i];
        }
    }

    public static int sumRange(int left, int right) {
        return ind[right + 1] - ind[left];
    }

    public static void main(String[] args){
        NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    }

}
