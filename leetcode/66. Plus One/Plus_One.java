import java.util.Arrays;

public class Plus_One{
// 66. Plus One
// Easy
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

 

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].
 

// Constraints:

// 1 <= digits.length <= 100
// 0 <= digits[i] <= 9
// digits does not contain any leading 0's.
//
// Runtime: 0ms - Beats: 100%
//Memory: 41.81MB - Beats: 68.98%

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            System.out.println(digits[i]);
            if(digits[i] <= 8 ){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }

        int[] nums = new int[digits.length + 1];
        nums[0] = 1;
        return nums;
    }


    public static void main(String[] args){

        int[] digits = {4,3,2,1};
        int[] digits2 = {1,2,3};
        int[] digits3 = {8,9,9,9};

        System.out.println(Arrays.toString(plusOne(digits3)));

    }
}
