package exercises.arrays;

import java.util.Arrays;
import java.util.Objects;

public class FindSubArray {


public void FindSubArray(int[] array){
    int sum = array[0];
    int current = array[0];
    int head = 0;
    int tail = 0;
    int finalHead = 0;
    int[] subArray;

    for(int i = 1; i < array.length; i++){
        if(array[i] > (sum + array[i])){
            sum = array[i];
            head = i;
        }else{
            sum += array[i];
        }

        if(current < sum){
            current = sum;
            tail = i;
            finalHead = head;
        }
    }
    subArray = Arrays.copyOfRange(array, finalHead, tail + 1);
    System.out.println("Sum: " + current);
    System.out.println("SubArray: " + Arrays.toString(subArray));
}
}
