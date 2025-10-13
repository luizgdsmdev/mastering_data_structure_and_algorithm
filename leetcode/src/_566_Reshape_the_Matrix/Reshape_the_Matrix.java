package _566_Reshape_the_Matrix;

//566. Reshape the Matrix
//Easy
//In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size
//r x c keeping its original data.
//You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns
//of the wanted reshaped matrix.
//The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise,
//output the original matrix.
//
//Example 1:
//Input: mat = [[1,2],[3,4]], r = 1, c = 4
//Output: [[1,2,3,4]]
//
//Example 2:
//Input: mat = [[1,2],[3,4]], r = 2, c = 4
//Output: [[1,2],[3,4]]
//
//Constraints:
//m == mat.length
//n == mat[i].length
//1 <= m, n <= 100
//-1000 <= mat[i][j] <= 1000
//1 <= r, c <= 300

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int elSum = 0;
        ArrayList<Integer> hold = new ArrayList<>();
        for(int i = 0; i < mat.length; i++) {
            elSum += mat[i].length;
            for(int num: mat[i]) hold.add(num);
        }
        if(elSum/r != c) return mat;

        int[][] output = new int[r][c];
        int index = 0;
        elSum = 0;
        while(index < r){
            int[] temp = new int[c];
            for(int i = 0; i < c; i++) {
                temp[i] = hold.get(elSum);
                elSum++;
            }
            output[index] = temp;
            index++;
        }
        return output;
    }

    public static void main(String[] args){

        matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4);
    }
}
