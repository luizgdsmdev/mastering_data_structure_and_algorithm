package HashTable;

//HT: Two Sum ( ** Interview Question) twoSum()
//
//Problem: Given an array of integers nums and a target integer target, find the indices of two numbers in the array that add up to the target.
//
//Input: An array of integers nums. A target integer target.
//
//Output: An array of two integers representing the indices of the two numbers in the input array nums that add up to the target.
//If no two numbers in the input array add up to the target, return an empty array [].
//Return type: int[]
//
//Example:
//Input: int[] nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Explanation: The numbers at indices 0 and 1 in the array add up to the target 9.
//
//Input: int[] nums = [3, 2, 4], target = 6
//Output: [1, 2]
//Explanation: The numbers at indices 1 and 2 in the array add up to the target 6.
//
//Input: int[] nums = [3, 3], target = 6
//Output: [0, 1]
//Explanation: The numbers at indices 0 and 1 in the array add up to the target 6.
//
//Input: int[] nums = [1, 2, 3, 4, 5], target = 10
//Output: []
//Explanation: There are no two numbers in the array add up to the target 10.
//
//Input: int[] nums = [], target = 0
//Output: []
//Explanation: There are no numbers in the input array, so the function returns an empty array [].


import java.util.Arrays;
import java.util.HashMap;

public class exerc_5 {

    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> myHash = new HashMap<>();
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(myHash.containsKey(diff)){
                output[0] = i;
                output[1] = myHash.get(diff);
                return output;
            }else{
                myHash.put(nums[i], i);
            }
        }
        int[] zero = {};
        return zero;

    }



    public static void main(String[] args) {
        System.out.println("These tests confirm twoSum() returns the indices");
        System.out.println("of two numbers in the array that add up to target.");
        System.out.println();

        // Test 1: Basic pair
        System.out.println("Test 1: Basic Pair");
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Expected: Indices: 0, 1 (any valid order)");
        System.out.println("Actual: " + Arrays.toString(twoSum(nums1, target1)));
        System.out.println();

        // Test 2: Multiple pairs exist
        System.out.println("Test 2: Multiple Pairs");
        int[] nums2 = {1, 3, 2, 4, 6};
        int target2 = 5;
        System.out.println("Expected: Any valid pair summing to 5. [1,2] or [0, 3] (any valid order)");
        System.out.println("Actual: " + Arrays.toString(twoSum(nums2, target2)));
        System.out.println();

        // Test 3: Negative numbers
        System.out.println("Test 3: Negative Numbers");
        int[] nums3 = {-3, 4, 3, 90};
        int target3 = 0;
        System.out.println("Expected: Indices of -3 and 3. [0, 2] (any valid order)");
        System.out.println("Actual: " + Arrays.toString(twoSum(nums3, target3)));
        System.out.println();

        // Test 4: Duplicates used twice
        System.out.println("Test 4: Duplicates Used Twice");
        int[] nums4 = {3, 3};
        int target4 = 6;
        System.out.println("Expected: Indices of both 3's. [0,1] (any valid order)");
        System.out.println("Actual: " + Arrays.toString(twoSum(nums4, target4)));
        System.out.println();

        // Test 5: No solution
        System.out.println("Test 5: No Solution");
        int[] nums5 = {1, 2, 3};
        int target5 = 10;
        System.out.println("Expected: []");
        System.out.println("Actual: " + Arrays.toString(twoSum(nums5, target5)));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm twoSum() returns the indices
            of two numbers in the array that add up to target.

            Test 1: Basic Pair
            Expected: Indices of 2 and 7 (any valid order)
            Actual: [0, 1] (or valid indices for 2,7)

            Test 2: Multiple Pairs
            Expected: Any valid pair summing to 5
            Actual: [1, 2] (or valid indices)

            Test 3: Negative Numbers
            Expected: Indices of -3 and 3
            Actual: [0, 2] (or valid indices)

            Test 4: Duplicates Used Twice
            Expected: Indices of both 3's
            Actual: [0, 1]

            Test 5: No Solution
            Expected: []
            Actual: []
        */

    }
}
