package exercises.arrays;

//Coding Exercise: Sorted Squared Array
//Question: You are given an array of Integers in which each subsequent value is not less than the previous value.
//Write a function that takes this array as an input and returns a new array with the squares of each number sorted
//in ascending order.


import java.util.Arrays;

public class SortedSquaredArray {
    //Using the sort() method
    public int[] SortedSquaredArray(int[] input){
        int[] newArray = new int[input.length];

        for(int i = 0; i < input.length; i++){
            newArray[i] = input[i] * input[i];
        }
        return Arrays.stream(newArray).sorted().toArray();
    }

    //Sorting mannualy, using two pointers approach
    public int[] SortedSquaredArrayM(int[] input){
        int n = input.length;
        int[] newArray = new int[n];
        int left = 0;
        int right = n - 1;
        int write_pointer = n - 1;

        while(write_pointer > 0){

            if(Math.abs(input[left]) > Math.abs(input[right])){
                newArray[write_pointer] = input[left] * input[left];
                left++;
            }else{
                newArray[write_pointer] = input[right] * input[right];
                right--;
            }
            write_pointer--;
        }
        return newArray;
    }


    public void main(String[] arg){
        int[] case1 = {1, 3, 5}; //[1,9,25]
        int[] case2 = {0, 5, 6}; //[0,25,36]
        int[] case3 = {-4, -2, 0, 1, 3}; //[0,1,4,9,16]
        int[] case4 = {5, -1, 2, -10}; //[1, 4, 25, 100]
        int[] case5 = {1, 2, 3, 4, 5}; //[1, 4, 9, 16, 25]
        int[] case6 = {-3, -1, 0, 8}; //[0, 1, 9, 64]

        SortedSquaredArray mySquareArray = new SortedSquaredArray();

        System.out.println(Arrays.toString(mySquareArray.SortedSquaredArrayM(case3)));;
    }
}
