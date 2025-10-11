package _500_Keyboard_Row;

//500. Keyboard Row
//Easy
//Given an array of strings words, return the words that can be typed using letters of the alphabet
//on only one row of American keyboard like the image below.
//Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated
//as if they are at the same row.
//In the American keyboard:
//
//the first row consists of the characters "qwertyuiop",
//the second row consists of the characters "asdfghjkl", and
//the third row consists of the characters "zxcvbnm".
//
//Example 1:
//Input: words = ["Hello","Alaska","Dad","Peace"]
//Output: ["Alaska","Dad"]
//Explanation:
//Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.
//
//Example 2:
//Input: words = ["omk"]
//Output: []
//Example 3:
//Input: words = ["adsdf","sfd"]
//Output: ["adsdf","sfd"]
//
//Constraints:
//1 <= words.length <= 20
//1 <= words[i].length <= 100
//words[i] consists of English letters (both lowercase and uppercase).

// -> Runtime: 0ms, beats 100% of submissions.
// -> Memory Usage: 41.60MB, beats 55.32% of submissions.

import java.util.*;

public class Keyboard_Row {

    public static String[] findWords(String[] words) {
        int[] map = new int[26];
        for (char a : "qwertyuiop".toCharArray()) map[a - 'a'] = 1;
        for (char b : "asdfghjkl".toCharArray()) map[b - 'a'] = 2;
        for (char c : "zxcvbnm".toCharArray()) map[c - 'a'] = 3;
        List<String> output = new ArrayList<>();

        for (String word : words) {
            String targ = word.toLowerCase();
            int crr = map[targ.charAt(0) - 'a'];
            boolean valid = true;

            for (char c : targ.toCharArray()) {
                if (map[c - 'a'] != crr) {
                    valid = false;
                    break;
                }
            }
            if (valid) output.add(word);
        }
        return output.toArray(new String[0]);
    }

    public static void main(String[] args){

        System.out.println(Arrays.toString(findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
    }
}
