package _804_Unique_Morse_Code_Words;

//804. Unique Morse Code Words
//Easy
//International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
//'a' maps to ".-",
//'b' maps to "-...",
//'c' maps to "-.-.", and so on.
//For convenience, the full table for the 26 letters of the English alphabet is given below:
//[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
//Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
//For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
//Return the number of different transformations among all words we have.
//
//Example 1:
//Input: words = ["gin","zen","gig","msg"]
//Output: 2
//Explanation: The transformation of each word is:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//There are 2 different transformations: "--...-." and "--...--.".
//
//Example 2:
//Input: words = ["a"]
//Output: 1
//
//Constraints:
//1 <= words.length <= 100
//1 <= words[i].length <= 12
//words[i] consists of lowercase English letters.

// -> Runtime: 2ms, beats 98.05% of submissions.
// -> Memory Usage: 41.99MB, beats 32.87% of submissions.

import java.util.HashSet;
import java.util.Set;

public class Unique_Morse_Code_Words {
    public static int uniqueMorseRepresentations(String[] words) {
        if(words.length == 1) return 1;
        Set<String> set = new HashSet<>(words.length);
        String[] holder = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(String word: words){
            StringBuilder wordTemp = new StringBuilder();
            for(char letter: word.toCharArray()){
                wordTemp.append(holder[letter - 'a']);
            }
            set.add(wordTemp.toString());
        }

        return set.size();
    }

    public static void main(String[] args){
        uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"});
    }
}
