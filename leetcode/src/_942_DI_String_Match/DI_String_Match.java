package _942_DI_String_Match;

//942. DI String Match
//Easy
//A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
//s[i] == 'I' if perm[i] < perm[i + 1], and
//s[i] == 'D' if perm[i] > perm[i + 1].
//Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
//
//Example 1:
//Input: s = "IDID"
//Output: [0,4,1,3,2]
//
//Example 2:
//Input: s = "III"
//Output: [0,1,2,3]
//
//Example 3:
//Input: s = "DDI"
//Output: [3,2,0,1]
//
//Constraints:
//1 <= s.length <= 105
//s[i] is either 'I' or 'D'.

// -> Runtime: 2ms, beats 95.63% of submissions.
// -> Memory Usage: 45.12MB, beats 67.59% of submissions.

public class DI_String_Match {
    public static int[] diStringMatch(String s) {
        int max = s.length();
        int min = 0;
        char[] array = s.toCharArray();
        int[] outuput = new int[max + 1];

        for(int i = 0; i < array.length; i++){
            if(array[i] == 'D'){
                outuput[i] = max;
                max--;
            }else{
                outuput[i] = min;
                min++;
            }
        }

        if(array[s.length() - 1] == 'D'){
            outuput[s.length()] = max;
            max--;
        }else{
            outuput[s.length()] = min;
            min++;
        }


        return outuput;
    }

    public static void main(String[] args){
        diStringMatch("D");
    }
}
