package _118_Pascals_Triangle;

//118. Pascal's Triangle
//Easy
//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//Example 1:
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//
//Example 2:
//Input: numRows = 1
//Output: [[1]]
//
//Constraints:
//1 <= numRows <= 30

// -> Runtime: 0ms, beats 100.00% of submissions.
// -> Memory Usage: 42.12MB, beats 41.91% of submissions.

import java.util.ArrayList;
import java.util.List;
public class Pascals_Triangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        rec(0, numRows, null, output);
        return output;
    }

    private static void rec(int row, int numRows, List<Integer> prev, List<List<Integer>> output) {
        if(row >= numRows) return;

        List<Integer> list = new ArrayList<>();
        if(row == 0) list.add(1);
        else{
            list.add(1);
            for(int i = 1; i < prev.size(); i++) {
                list.add(prev.get(i - 1) + prev.get(i));
            }
            list.add(1);
        }
        output.add(list);
        rec(row + 1, numRows, list, output);
    }

    public static void main(String[] args   ){
        System.out.println(generate(5));
    }
}
