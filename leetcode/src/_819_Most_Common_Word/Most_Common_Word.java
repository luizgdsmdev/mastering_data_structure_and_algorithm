package _819_Most_Common_Word;

//819. Most Common Word
//Easy
//Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned.
//It is guaranteed there is at least one word that is not banned, and that the answer is unique.
//The words in paragraph are case-insensitive and the answer should be returned in lowercase.
//Note that words can not contain punctuation symbols.
//
//Example 1:
//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
//Output: "ball"
//Explanation:
//"hit" occurs 3 times, but it is a banned word.
//"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
//Note that words in the paragraph are not case sensitive,
//that punctuation is ignored (even if adjacent to words, such as "ball,"),
//and that "hit" isn't the answer even though it occurs more because it is banned.
//
//Example 2:
//Input: paragraph = "a.", banned = []
//Output: "a"
//
//Constraints:
//1 <= paragraph.length <= 1000
//paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
//0 <= banned.length <= 100
//1 <= banned[i].length <= 10
//banned[i] consists of only lowercase English letters.

// -> Runtime: 12ms, beats 84.18% of submissions.
// -> Memory Usage: 42.90MB, beats 81.89% of submissions.

import java.util.*;

public class Most_Common_Word {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        String[] holder = paragraph.split("\\W+");
        int max = 0;
        String output = "";

        for(String word: holder){
            String temp = word.toLowerCase();
            if (!ban.contains(temp)) {
                map.put(temp, map.getOrDefault(temp, 0) + 1);
                if (map.get(temp) > max) {
                    max = map.get(temp);
                    output = temp;
                }
            }
        }
        return output;
    }

    public static void main(String[] args){
        String a = "Bob hit a ball, the hit BALL flew far after it was hit.";
        mostCommonWord(a, new String[]{"hit"});
    }
}
