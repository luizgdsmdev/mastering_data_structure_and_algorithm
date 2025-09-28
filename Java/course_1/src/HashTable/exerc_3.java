package HashTable;

//HT: First Non-Repeating Character ( ** Interview Question)
//You have been given a string of lowercase letters.
//
//Write a function called firstNonRepeatingChar(String) that finds the first non-repeating character in
//the given string using a hash table (HashMap). If there is no non-repeating character in the string,
//he function should return null.
//For example, if the input string is "leetcode", the function should return "l" because "l" is the first
//character that appears only once in the string. Similarly, if the input string is "hello", the function
//should return "h" because "h" is the first non-repeating character in the string.
//Return type: Character

import java.util.HashMap;

public class exerc_3 {

    public static String firstNonRepeatingChar(String string){
        char[] stringArray = string.toCharArray();

        if(stringArray.length == 0) return null;
        if(stringArray.length == 1) return string;

        HashMap<Character, Integer> myhash = new HashMap<Character, Integer>(stringArray.length);
        for(char lt: stringArray){
            myhash.merge(lt, 1, (oldVal, newVal) -> newVal + 1);
        }

        for(char lt: stringArray){
            if(myhash.get(lt) == 1) return "" + lt;
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println("These tests confirm firstNonRepeatingChar()");
        System.out.println("returns the first unique character or null");
        System.out.println("if no unique character exists.");
        System.out.println();

        // Test 1: First unique character exists
        System.out.println("Test 1: First Unique Exists");
        String input1 = "swiss";
        System.out.println("Expected: w");
        System.out.println("Actual: " + firstNonRepeatingChar(input1));
        System.out.println();

        // Test 2: No unique character
        System.out.println("Test 2: No Unique Character");
        String input2 = "aabbcc";
        System.out.println("Expected: null");
        System.out.println("Actual: " + firstNonRepeatingChar(input2));
        System.out.println();

        // Test 3: First character is unique
        System.out.println("Test 3: First Character Unique");
        String input3 = "alphabet";
        System.out.println("Expected: l");
        System.out.println("Actual: " + firstNonRepeatingChar(input3));
        System.out.println();

        // Test 4: Mixed duplicates
        System.out.println("Test 4: Mixed Duplicates");
        String input4 = "success";
        System.out.println("Expected: u");
        System.out.println("Actual: " + firstNonRepeatingChar(input4));
        System.out.println();

        // Test 5: Empty string
        System.out.println("Test 5: Empty String");
        String input5 = "";
        System.out.println("Expected: null");
        System.out.println("Actual: " + firstNonRepeatingChar(input5));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm firstNonRepeatingChar()
            returns the first unique character or null
            if no unique character exists.

            Test 1: First Unique Exists
            Expected: w
            Actual: w

            Test 2: No Unique Character
            Expected: null
            Actual: null

            Test 3: First Character Unique
            Expected: l
            Actual: l

            Test 4: Mixed Duplicates
            Expected: u
            Actual: u

            Test 5: Empty String
            Expected: null
            Actual: null
        */

    }
}
