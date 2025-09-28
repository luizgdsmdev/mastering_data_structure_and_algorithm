package HashTable;

//HT: Item In Common ( ** Interview Question)
//Write a function itemInCommon(array1, array2) that takes two arrays as input and returns true if there is at
//least one common item between the two lists, false otherwise.
//
//Use a HashMap to solve the problem that creates an O(n) time complexity.

import java.util.HashMap;
import java.util.Arrays;

public class exerc_1 {

    public static boolean itemInCommon(int[] array1, int[] array2){
        if(array1.length == 0 || array2.length == 0) return false;

        int count = Math.min(array1.length, array2.length);
        HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>(count);

        if(array1.length < array2.length){
            for(int i = 0; i < count; i++){
                myHashMap.put(array1[i], i);
            }

            for(int j = 0; j < array2.length; j++){
                if(myHashMap.containsKey(array2[j])) return true;
            }
        }else{
            for(int i = 0; i < count; i++){
                myHashMap.put(array2[i], i);
            }

            for(int j = 0; j < array1.length; j++){
                if(myHashMap.containsKey(array1[j])) return true;
            }
        }

        return false;

//        //Since we're dealing with sorted values in ascending order on the arrays, it's also
//        //possible to use the build in Arrays.binarySearch(numbers, target) method.
//        //O(min(n, m) * log(max(n, m))), but is more memory efficient
//        for(int i = 0; i < count; i++){//Counting from the lowest length between arrays
//
//            if(array1.length < array2.length){
//                if(Arrays.binarySearch(array2, array1[i]) >= 0){
//                    return true;
//                }
//            }else{
//                if(Arrays.binarySearch(array1, array2[i]) >= 0){
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    public static void main(String[] args) {
        System.out.println("These tests confirm itemInCommon() detects");
        System.out.println("whether two arrays share any common element.");
        System.out.println();

        // Test 1: Common element exists
        System.out.println("Test 1: Common Element Exists");
        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 4, 5};
        System.out.println("Expected: true");
        System.out.println("Actual: " + itemInCommon(array1, array2));
        System.out.println();

        // Test 2: No common element
        System.out.println("Test 2: No Common Element");
        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6};
        System.out.println("Expected: false");
        System.out.println("Actual: " + itemInCommon(array3, array4));
        System.out.println();

        // Test 3: All elements match
        System.out.println("Test 3: All Elements Match");
        int[] array5 = {7, 8, 9};
        int[] array6 = {7, 8, 9};
        System.out.println("Expected: true");
        System.out.println("Actual: " + itemInCommon(array5, array6));
        System.out.println();

        // Test 4: Arrays with duplicates
        System.out.println("Test 4: Arrays with Duplicates");
        int[] array7 = {1, 1, 2, 3};
        int[] array8 = {3, 3, 4, 5};
        System.out.println("Expected: true");
        System.out.println("Actual: " + itemInCommon(array7, array8));
        System.out.println();

        // Test 5: Edge case with empty array
        System.out.println("Test 5: Edge Case with Empty Array");
        int[] array9 = {};
        int[] array10 = {1, 2, 3};
        System.out.println("Expected: false");
        System.out.println("Actual: " + itemInCommon(array9, array10));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm itemInCommon() detects
            whether two arrays share any common element.

            Test 1: Common Element Exists
            Expected: true
            Actual: true

            Test 2: No Common Element
            Expected: false
            Actual: false

            Test 3: All Elements Match
            Expected: true
            Actual: true

            Test 4: Arrays with Duplicates
            Expected: true
            Actual: true

            Test 5: Edge Case with Empty Array
            Expected: false
            Actual: false
        */

    }
}
