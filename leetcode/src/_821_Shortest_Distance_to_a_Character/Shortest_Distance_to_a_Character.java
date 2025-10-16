package _821_Shortest_Distance_to_a_Character;

//821. Shortest Distance to a Character
//Easy
//Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i]
//is the distance from index i to the closest occurrence of character c in s.
//The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
//
//Example 1:
//Input: s = "loveleetcode", c = "e"
//Output: [3,2,1,0,1,0,0,1,2,2,1,0]
//Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
//The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
//The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
//For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
//The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
//
//Example 2:
//Input: s = "aaab", c = "b"
//Output: [3,2,1,0]
//
//Constraints:
//1 <= s.length <= 104
//s[i] and c are lowercase English letters.
//It is guaranteed that c occurs at least once in s.

// -> Runtime: 1ms, beats 99.63% of submissions.
// -> Memory Usage: 42.60MB, beats 69.71% of submissions.

public class Shortest_Distance_to_a_Character {
    public static int[] shortestToChar(String s, char c) {
        int[] holder = new int[s.length()];
        int prev = -s.length();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) prev = i;
            holder[i] = i - prev;
        }

        prev = 2 * s.length();
        for(int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == c) prev = i;
            holder[i] = Math.min(holder[i], prev - i);
        }

        return holder;
    }

    public static void main(String[] args){
        shortestToChar("eoveleetcode", 'e');
    }
}
