package _108_Convert_Sorted_Array_to_Binary_Search_Tree;

//108. Convert Sorted Array to Binary Search Tree
//Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
//
//Example 1:
//Input: nums = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//
//Example 2:
//Input: nums = [1,3]
//Output: [3,1]
//Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
//
//
//Constraints:
//
//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums is sorted in a strictly increasing order.

import java.util.ArrayList;
import java.util.List;


// -> Runtime: 0ms, beats 100.00% of submissions.
// -> Memory Usage: 43.20MB, beats 58.34% of submissions.
public class Convert_Sorted_Array_to_Binary_Search_Tree {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static TreeNode rec(int[] nums, int left, int right){
        if(left > right) return null;
        TreeNode root = new TreeNode(nums[(left + right)/2]);
        root.right = rec(nums, (left+right)/2 + 1, right);
        root.left = rec(nums, left, (left+right)/2 - 1);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return rec(nums,0,nums.length-1);
    }


    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5};
        sortedArrayToBST(nums);
    }
}
