package _867_Transpose_Matrix;

//867. Transpose Matrix
//Easy
//Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//
//Example 1:
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//
//Example 2:
//Input: matrix = [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]
//
//Constraints:
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 1000
//1 <= m * n <= 105
//-109 <= matrix[i][j] <= 109

// -> Runtime: 0ms, beats 100% of submissions.
// -> Memory Usage: 45.05MB, beats 38.55% of submissions.

public class Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] output = new int[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) output[j][i] = matrix[i][j];
        }

        return output;
    }

    public static void main(String[] args){
        transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
