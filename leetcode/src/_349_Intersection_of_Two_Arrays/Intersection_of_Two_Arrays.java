package _349_Intersection_of_Two_Arrays;

//349. Intersection of Two Arrays
//Easy
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
//must be unique and you may return the result in any order.
//
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
//
//
//Constraints:
//1 <= nums1.length, nums2.length <= 1000
//0 <= nums1[i], nums2[i] <= 1000

// -> Runtime: 0ms, beats 96.62% of submissions.
// -> Memory Usage: 43.56MB, beats 35.97% of submissions.

import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums1){
            set.add(num);
        }

        int[] out = new int[Math.max(nums1.length, nums2.length)];
        int i=0;
        for(int num2: nums2){
            if(set.contains(num2)){
                set.remove(num2);
                out[i] = num2;
                i++;
            }
        }

        return Arrays.copyOf(out, i);

    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
