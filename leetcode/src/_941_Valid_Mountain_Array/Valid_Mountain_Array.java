package _941_Valid_Mountain_Array;

//941. Valid Mountain Array
//Easy
//Given an array of integers arr, return true if and only if it is a valid mountain array.
//Recall that arr is a mountain array if and only if:
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//
//Example 1:
//Input: arr = [2,1]
//Output: false
//
//Example 2:
//Input: arr = [3,5,5]
//Output: false
//
//Example 3:
//Input: arr = [0,3,2,1]
//Output: true
//
//Constraints:
//1 <= arr.length <= 104
//0 <= arr[i] <= 104

// -> Runtime: 2ms, beats 70.34% of submissions.
// -> Memory Usage: 45.13MB, beats 88.14% of submissions.

public class Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length <= 2) return false;
        int top = 0;
        int i = 1;

        while(i < arr.length){
            if(arr[i] > arr[i - 1] && i < arr.length - 1){
                top = i;
                i++;
            }else if(arr[i] == arr[i - 1]) return false;
            else break;
        }

        if (top == 0 || top == arr.length - 1) return false;
        for(int m = top + 1; m < arr.length; m++){
            if(arr[m] >= arr[m - 1]) return false;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(validMountainArray(new int[]{3,5,5}));
    }
}
