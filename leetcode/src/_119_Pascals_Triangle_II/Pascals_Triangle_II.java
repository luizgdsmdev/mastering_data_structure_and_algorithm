package _119_Pascals_Triangle_II;

//119. Pascal's Triangle II
//Easy
//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//Example 1:
//Input: rowIndex = 3
//Output: [1,3,3,1]
//
//Example 2:
//Input: rowIndex = 0
//Output: [1]
//
//Example 3:
//Input: rowIndex = 1
//Output: [1,1]
//
//Constraints:
//0 <= rowIndex <= 33
//
//Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle_II {

    public static long factorial(int rowIndex, int index) {
        if (index > rowIndex - index) {
            index = rowIndex - index;
        }
        long result = 1;
        for (int i = 0; i < index; i++) {
            result *= (rowIndex - i);
            result /= (i + 1);
        }
        return result;
    }

    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return new ArrayList<>(List.of(1));
        if (rowIndex == 1) return new ArrayList<>(List.of(1, 1));
        if (rowIndex == 2) return new ArrayList<>(List.of(1, 2, 1));

        List<Integer> out = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            long value = factorial(rowIndex, i);
            out.add((int) value);
        }
        return out;
    }

    public static void main(String[] args){
        System.out.println(getRow(30));
    }
}
