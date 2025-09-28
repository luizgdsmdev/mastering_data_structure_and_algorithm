package HashTable;

//HT: Find Duplicates ( ** Interview Question)
//findDuplicates()
//
//Problem: Given an array of integers nums, find all the duplicates in the array using a hash table (HashMap).
//Input: An array of integers nums.
//Return Type:
//
//List<Integer> implemented as an ArrayList
//List is an interface and ArrayList is a way of implementing the List interface

//Input: int[] nums = [4, 3, 2, 7, 8, 2, 3, 1]
//Output: [2, 3]
//Explanation: The numbers 2 and 3 appear more than once in the input array.
//
//Input: int[] nums = [1, 2, 3, 4, 5]
//Output: []
//Explanation: There are no duplicates in the input array, so the function returns an empty list [].
//
//Input: int[] nums = [3, 3, 3, 3, 3]
//Output: [3]
//Explanation: The number 3 appears more than once in the input array.
//
//Input: int[] nums = [-1, 0, 1, 0, -1, -1, 2, 2]
//Output: [-1, 0, 2]
//Explanation: The numbers -1, 0, and 2 appear more than once in the input array.
//
//Input: int[] nums = []
//Output: []
//Explanation: There are no numbers in the input array, so the function returns an empty list [].

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class exerc_2 {

    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> mylist = new ArrayList<Integer>(nums.length);
        if(nums.length <= 1) return mylist;

        HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>(nums.length);
        for(int num : nums) {
            duplicates.merge(num, 1, (oldValue, newValue) -> oldValue + 1);
        }

        for(int key: duplicates.keySet()){
            if (duplicates.get(key) > 1) mylist.add(key);
        }

        return mylist;
    }


    public static void main(String[] args) {
        System.out.println("These tests confirm findDuplicates() correctly");
        System.out.println("identifies all elements that occur more than once.");
        System.out.println();

        // Test 1: Single duplicate
        System.out.println("Test 1: Single Duplicate");
        int[] nums1 = {1, 2, 3, 2};
        System.out.println("Expected: [2]");
        System.out.println("Actual: " + findDuplicates(nums1));
        System.out.println();

        // Test 2: No duplicates
        System.out.println("Test 2: No Duplicates");
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Expected: []");
        System.out.println("Actual: " + findDuplicates(nums2));
        System.out.println();

        // Test 3: Multiple duplicates
        System.out.println("Test 3: Multiple Duplicates");
        int[] nums3 = {1, 2, 2, 3, 3, 4};
        System.out.println("Expected: [2, 3] (order may vary)");
        System.out.println("Actual: " + findDuplicates(nums3));
        System.out.println();

        // Test 4: All elements are duplicates
        System.out.println("Test 4: All Elements Duplicates");
        int[] nums4 = {5, 5, 5, 5};
        System.out.println("Expected: [5]");
        System.out.println("Actual: " + findDuplicates(nums4));
        System.out.println();

        // Test 5: Empty array
        System.out.println("Test 5: Empty Array");
        int[] nums5 = {};
        System.out.println("Expected: []");
        System.out.println("Actual: " + findDuplicates(nums5));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm findDuplicates() correctly
            identifies all elements that occur more than once.

            Test 1: Single Duplicate
            Expected: [2]
            Actual: [2]

            Test 2: No Duplicates
            Expected: []
            Actual: []

            Test 3: Multiple Duplicates
            Expected: [2, 3] (order may vary)
            Actual: [2, 3]

            Test 4: All Elements Duplicates
            Expected: [5]
            Actual: [5]

            Test 5: Empty Array
            Expected: []
            Actual: []
        */

    }
}
