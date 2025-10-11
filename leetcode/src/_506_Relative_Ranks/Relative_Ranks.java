package _506_Relative_Ranks;

//506. Relative Ranks
//Easy
//You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition.
//All the scores are guaranteed to be unique.
//The athletes are placed based on their scores, where the 1st place athlete has the highest score,
//the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
//
//The 1st place athlete's rank is "Gold Medal".
//The 2nd place athlete's rank is "Silver Medal".
//The 3rd place athlete's rank is "Bronze Medal".
//For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
//Return an array answer of size n where answer[i] is the rank of the ith athlete.
//
//Example 1:
//Input: score = [5,4,3,2,1]
//Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
//Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
//
//Example 2:
//Input: score = [10,3,8,9,4]
//Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
//Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
//
//Constraints:
//n == score.length
//1 <= n <= 104
//0 <= score[i] <= 106
//All the values in score are unique.

// -> Runtime: 0ms, beats 77.03% of submissions.
// -> Memory Usage: 46,47MB, beats 5.52% of submissions.

import java.util.*;

public class Relative_Ranks {
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for(int i = 0; i < score.length; i++) queue.add(new int[] {score[i], i});
        String[] output = new String[score.length];
        int crr = 0;

        while(!queue.isEmpty()) {
            if(crr == 0) output[queue.remove()[1]] = "Gold Medal";
            else if(crr == 1) output[queue.remove()[1]] = "Silver Medal";
            else if(crr == 2) output[queue.remove()[1]] = "Bronze Medal";
            else output[queue.remove()[1]] = (crr + 1) + "";
            crr++;
        }

        return output;


        //Second solution
//        int[][] scIndex = new int[score.length][2];
//        for(int i = 0; i < score.length; i++) {
//            scIndex[i][0] = score[i];
//            scIndex[i][1] = i;
//        }
//        Arrays.sort(scIndex, (a, b) -> b[0] - a[0]);
//
//        String[] output = new String[score.length];
//        for(int i = 0; i < score.length; i++) {
//            int crr = scIndex[i][1];
//            if (i == 0) output[crr] = "Gold Medal";
//            else if (i == 1) output[crr] = "Silver Medal";
//            else if (i == 2) output[crr] = "Bronze Medal";
//            else output[crr] = String.valueOf(i + 1);
//        }
//        return output;


        //First solution
//        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
//        Map<Integer, Integer> map = new HashMap<>(score.length);
//        String[] output = new String[score.length];
//
//        for(int i = 0; i < score.length; i++){
//            map.put(score[i], i);
//            queue.add(score[i]);
//        }
//
//        int crr = 0;
//        while(!queue.isEmpty()){
//            if(crr == 0) output[map.get(queue.remove())] = "Gold Medal";
//            else if(crr == 1) output[map.get(queue.remove())] = "Silver Medal";
//            else if(crr == 2) output[map.get(queue.remove())] = "Bronze Medal";
//            else output[map.get(queue.remove())] = (crr + 1) + "";
//            crr++;
//        }
//
//        return output;
    }

    public static void main(String[] args){
        findRelativeRanks(new int[]{5,4,3,2,1});
    }
}
