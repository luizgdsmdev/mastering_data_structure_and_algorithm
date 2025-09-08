package mastering_data_structure_and_algorithm.leetcode;

import java.util.Arrays;
// No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.
// Given an integer n, return a list of two integers [a, b] where:
// a and b are No-Zero integers.
// a + b = n
// The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.

// Example 1:
// Input: n = 2
// Output: [1,1]
// Explanation: Let a = 1 and b = 1.
// Both a and b are no-zero integers, and a + b = 2 = n.
// Example 2:
// Input: n = 11
// Output: [2,9]
// Explanation: Let a = 2 and b = 9.
// Both a and b are no-zero integers, and a + b = 11 = n.
// Note that there are other valid answers as [8, 3] that can be accepted.

// Constraints:
// 2 <= n <= 104

//Results:
// -> Runtime: 0ms, beats 100.00% of JavaScript online submissions.
// -> Memory Usage: 53.70MB, beats 59.42% of JavaScript online submissions.

public class exerc_6 {
    public static int[] getNoZeroIntegers(int n){
        //Integer.toString(n).indexOf('0')
        int factor = 1;

        while(
                Integer.toString(n).indexOf('0') != -1 || Integer.toString((n - factor)).indexOf('0') != -1
        ){
            ++factor;
        }
        return new int[]{(n - factor), factor};
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(getNoZeroIntegers(1010)));
    }
}