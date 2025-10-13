package _605_Can_Place_Flowers;

//605. Can Place Flowers
//Easy
//You have a long flowerbed in which some of the plots are planted, and some are not.
//However, flowers cannot be planted in adjacent plots.
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
//return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//
//Example 1:
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//
//Example 2:
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
//
//Constraints:
//1 <= flowerbed.length <= 2 * 104
//flowerbed[i] is 0 or 1.
//There are no two adjacent flowers in flowerbed.
//0 <= n <= flowerbed.length

// -> Runtime: 1ms, beats 97.61% of submissions.
// -> Memory Usage: 45.52MB, beats 79.30% of submissions.

public class Can_Place_Flowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0 || flowerbed.length == 1 && n == 1 && flowerbed[0] == 0) return true;
        if(n > flowerbed.length) return false;

        if(flowerbed.length >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }
        if(flowerbed.length >= 2 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0 && n >= 1){
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }

        for(int i = 1; i < flowerbed.length; i++){
            if(n == 0) return true;
            if( flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return false;
    }


    public static void main(String[] args){
        System.out.println(canPlaceFlowers(new int[]{0,0,0,0,0}, 3));
    }
}
