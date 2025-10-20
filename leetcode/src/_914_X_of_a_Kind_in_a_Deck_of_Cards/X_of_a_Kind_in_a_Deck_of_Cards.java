package _914_X_of_a_Kind_in_a_Deck_of_Cards;

//914. X of a Kind in a Deck of Cards
//Easy
//You are given an integer array deck where deck[i] represents the number written on the ith card.
//Partition the cards into one or more groups such that:
//Each group has exactly x cards where x > 1, and
//All the cards in one group have the same integer written on them.
//Return true if such partition is possible, or false otherwise.
//
//Example 1:
//Input: deck = [1,2,3,4,4,3,2,1]
//Output: true
//Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
//
//Example 2:
//Input: deck = [1,1,1,2,2,2,3,3]
//Output: false
//Explanation: No possible partition.
//
//Constraints:
//1 <= deck.length <= 104
//0 <= deck[i] < 104

// -> Runtime: 11ms, beats 46.02% of submissions.
// -> Memory Usage: 45.83MB, beats 16.24% of submissions.

import java.util.HashMap;
import java.util.Map;

public class X_of_a_Kind_in_a_Deck_of_Cards {

    private static int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean hasGroupsSizeX(int[] deck){
        Map<Integer, Integer> map  = new HashMap<>();
        for(int num: deck) map.put(num, map.getOrDefault(num, 0) + 1);

        int valueHolder = map.get(deck[0]);
        for(int value: map.values()){
            valueHolder = gcd(valueHolder, value);
        }

        return valueHolder >= 2;
    }

    public static void main(String[] args){
        System.out.println(hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }
}
