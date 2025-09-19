package exercises.arrays;

public class FindSubArray {

    FindSubArray(){

    }

public int getSum(int[] array){
    int max = array[0];
    int current = array[0];

    for(int i = 1; i < array.length; i++){
        max = Math.max(array[i], max + array[i]);
        current = Math.max(current, max);
    }
    return current;
}
}
