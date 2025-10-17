package _883_Projection_Area_of_3D_Shapes;

//883. Projection Area of 3D Shapes
//Easy
//You are given an n x n grid where we place some 1 x 1 x 1 cubes that are axis-aligned with the x, y, and z axes.
//Each value v = grid[i][j] represents a tower of v cubes placed on top of the cell (i, j).
//We view the projection of these cubes onto the xy, yz, and zx planes.
//A projection is like a shadow, that maps our 3-dimensional figure to a 2-dimensional plane. We are viewing the "shadow" when looking
//at the cubes from the top, the front, and the side.
//Return the total area of all three projections.
//
//Example 1:
//Input: grid = [[1,2],[3,4]]
//Output: 17
//Explanation: Here are the three projections ("shadows") of the shape made with each axis-aligned plane.
//
//Example 2:
//Input: grid = [[2]]
//Output: 5
//
//Example 3:
//Input: grid = [[1,0],[0,2]]
//Output: 8
//
//Constraints:
//n == grid.length == grid[i].length
//1 <= n <= 50
//0 <= grid[i][j] <= 50

// -> Runtime: 3ms, beats 11.42% of submissions.
// -> Memory Usage: 44.13MB, beats 84.25% of submissions.

public class Projection_Area_of_3D_Shapes {
    public static int projectionArea(int[][] grid) {
        if (grid.length == 0) return 0;
        int n = grid.length;
        int up = 0, side = 0, back = 0;
        int[] maxRow = new int[n];
        int[] maxCol = new int[n];

        int row = 0;
        int col = 0;

        for (int i = 0; i < n; i++) {
            int rowTemp = 0;
            int colTemp = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) up++;
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
                rowTemp += Math.max(rowTemp, grid[i][j]);
                colTemp += Math.max(colTemp, grid[i][j]);
            }

            row += rowTemp;
            col += colTemp;
        }

        for (int m : maxRow) side += m;
        for (int m : maxCol) back += m;

        return up + row + col;
    }

    public static void main(String[] args){
        projectionArea(new int[][]{{1,2},{3,4}});
    }
}
