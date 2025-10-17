package _832_Flipping_an_Image;

//832. Flipping an Image
//Easy
//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//To flip an image horizontally means that each row of the image is reversed.
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//For example, inverting [0,1,1] results in [1,0,0].
//
//Example 1:
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//
//Example 2:
//Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//
//Constraints:
//n == image.length
//n == image[i].length
//1 <= n <= 20
//images[i][j] is either 0 or 1.

// -> Runtime: 0ms, beats 100% of submissions.
// -> Memory Usage: 44.94MB, beats 14.31% of submissions.

public class Flipping_an_Image {
    public static int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0; i < image.length; i++){
            int[] temp = new int[image[i].length];
            int crr = 0;

            for(int j = image[i].length - 1; j >= 0; j--){
                image[i][crr] = image[i][j] ^ 1;
                crr++;
            }

            image[i] = temp;
        }


//        Solution 1
//        for(int[] row: image){
//
//            int left = 0;
//            int rigth = row.length - 1;
//            while(left < rigth){
//                int temp = row[left];
//                row[left] = row[rigth];
//                row[rigth] = temp;
//
//                left++;
//                rigth--;
//            }
//
//            for(int i = 0; i < row.length; i++){
//                if(row[i] == 1) row[i] = 0;
//                else row[i] = 1;
//            }
//
//        }

        return image;
    }


    public static void main(String[] args){
        flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
    }
}
