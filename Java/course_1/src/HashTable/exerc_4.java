package HashTable;


//HT: Group Anagrams ( ** Interview Question)
//You have been given an array of strings, where each string may contain only lowercase English letters.
//You need to write a method groupAnagrams(String[] strings) that groups the anagrams in the array together
//using a hash table (HashMap). The method should return a list of lists, where each inner array contains a
//group of anagrams.
//
//For example, if the input array is ["eat", "tea", "tan", "ate", "nat", "bat"], the method should return
//[["eat","tea","ate"],["tan","nat"],["bat"]] because the first three strings are anagrams of each other,
//the next two strings are anagrams of each other, and the last string has no anagrams in the input array.
//
//You need to implement the groupAnagrams(String[] strings) method and return a list of lists, where each inner list
//contains a group of anagrams according to the above requirements.

//Return type: List<List<String>>


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class exerc_4 {

    public static List<List<String>> groupAnagrams(String[] arrayString){
        if(arrayString.length == 0) return new ArrayList<>();

        HashMap<String, List<String>> myHash = new HashMap<>();

        for(int i = 0; i < arrayString.length; i++){
            char[] preKey = arrayString[i].toCharArray();
            Arrays.sort(preKey);

            String key = new String(preKey);

            List<String> myList = myHash.getOrDefault(key, new ArrayList<String>());
            myList.add(arrayString[i]);
            myHash.put(key, myList);
        }

        List<List<String>> output = new ArrayList<List<String>>();
        for(String key: myHash.keySet()){
            output.add(myHash.get(key));
        }

        return output;

    }

    public static void main(String[] args) {
        System.out.println("These tests confirm groupAnagrams() groups");
        System.out.println("words by sorted characters, including handling");
        System.out.println("duplicates, empty strings, and multiple groups.");
        System.out.println();

        // Test 1: Single group of anagrams
        System.out.println("Test 1: Single Group");
        String[] input1 = {"bat", "tab"};
        System.out.println("Expected: [[bat, tab]]");
        System.out.println("Actual: " + groupAnagrams(input1));
        System.out.println();

        // Test 2: Words with no anagrams
        System.out.println("Test 2: Single Words Remain");
        String[] input2 = {"dog", "cat"};
        System.out.println("Expected: [[dog], [cat]] (order may vary)");
        System.out.println("Actual: " + groupAnagrams(input2));
        System.out.println();

        // Test 3: Multiple groups
        System.out.println("Test 3: Multiple Groups");
        String[] input3 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Expected: [[eat, tea, ate], [tan, nat], [bat]]");
        System.out.println("Actual: " + groupAnagrams(input3));
        System.out.println();

        // Test 4: Duplicate words
        System.out.println("Test 4: Duplicate Words");
        String[] input4 = {"bat", "tab", "bat"};
        System.out.println("Expected: [[bat, bat, tab]]");
        System.out.println("Actual: " + groupAnagrams(input4));
        System.out.println();

        // Test 5: Edge cases (empty strings and empty input)
        System.out.println("Test 5: Edge Cases");
        String[] input5 = {"", ""};
        String[] input6 = {};
        System.out.println("Expected (empty strings): [[, ]]");
        System.out.println("Actual: " + groupAnagrams(input5));
        System.out.println("Expected (empty input): []");
        System.out.println("Actual: " + groupAnagrams(input6));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm groupAnagrams() groups
            words by sorted characters, including handling
            duplicates, empty strings, and multiple groups.

            Test 1: Single Group
            Expected: [[bat, tab]]
            Actual: [[bat, tab]]

            Test 2: Single Words Remain
            Expected: [[dog], [cat]] (order may vary)
            Actual: [[dog], [cat]]

            Test 3: Multiple Groups
            Expected: [[eat, tea, ate], [tan, nat], [bat]]
            Actual: [[eat, tea, ate], [tan, nat], [bat]]

            Test 4: Duplicate Words
            Expected: [[bat, bat, tab]]
            Actual: [[bat, bat, tab]]

            Test 5: Edge Cases
            Expected (empty strings): [[, ]]
            Actual: [[, ]]
            Expected (empty input): []
            Actual: []
        */

    }
}
