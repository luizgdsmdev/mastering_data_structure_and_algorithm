package exercises.arrays;

public class Main {
    int[] case1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //[4, -1, 2, 1];
    int[] case2 = {-2, -3, -1, -5}; //[-1];
    int[] case3 = {5}; //[5];
    int[] case4 = {1, 2, 3, 4}; //[1, 2, 3, 4];
    int[] case5 = {5, 4, -10, 2, 3}; //[5, 4];
    int[] case6 = {3, -2, 5, -1, -2, 6, -3}; //[3, -2, 5, -1, -2, 6];
    int[] case7 = {-3, -2, 1, 5, 6}; //[1, 5, 6];
    int[] case8 = {-2, 0, -1, 0, -3}; //[0];

    public void main(String[] args){
        FindSubArray action = new FindSubArray();
        action.FindSubArray(case4);
    }
}
