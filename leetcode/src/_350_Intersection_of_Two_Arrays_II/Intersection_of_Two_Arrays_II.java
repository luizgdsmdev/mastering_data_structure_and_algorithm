package _350_Intersection_of_Two_Arrays_II;

//350. Intersection of Two Arrays II
//Easy
//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must appear as many times as it shows in both arrays and
//you may return the result in any order.
//
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.
//
//Constraints:
//1 <= nums1.length, nums2.length <= 1000
//0 <= nums1[i], nums2[i] <= 1000
//
//Follow up:
//What if the given array is already sorted? How would you optimize your algorithm?
//What if nums1's size is small compared to nums2's size? Which algorithm is better?
//What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?


// -> Runtime: 0ms, beats 90.18% of submissions.
// -> Memory Usage: 43.12MB, beats 76.81% of submissions.


import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums1){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else map.put(num, 1);
        }

        int[] output = new int[Math.min(nums1.length, nums2.length)];
        int j = 0;
        for(int num2: nums2){
            if(map.containsKey(num2) && map.get(num2) > 0){
                output[j] = num2;
                map.put(num2, map.get(num2) - 1);
                j++;
            }
        }

        return Arrays.copyOf(output, j);
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
