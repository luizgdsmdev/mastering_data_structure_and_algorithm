package _705_Design_HashSet;

//705. Design HashSet
//Easy
//Design a HashSet without using any built-in hash table libraries.
//Implement MyHashSet class:
//
//void add(key) Inserts the value key into the HashSet.
//bool contains(key) Returns whether the value key exists in the HashSet or not.
//void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
//
//Example 1:
//Input
//["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
//[[], [1], [2], [1], [3], [2], [2], [2], [2]]
//Output
//[null, null, null, true, false, null, true, null, false]
//
//Explanation
//MyHashSet myHashSet = new MyHashSet();
//myHashSet.add(1);      // set = [1]
//myHashSet.add(2);      // set = [1, 2]
//myHashSet.contains(1); // return True
//myHashSet.contains(3); // return False, (not found)
//myHashSet.add(2);      // set = [1, 2]
//myHashSet.contains(2); // return True
//myHashSet.remove(2);   // set = [1]
//myHashSet.contains(2); // return False, (already removed)
//
//Constraints:
//0 <= key <= 106
//At most 104 calls will be made to add, remove, and contains.

// -> Runtime: 73ms, beats 16.12% of submissions.
// -> Memory Usage: 49.37MB, beats 86.05% of submissions.

import java.util.*;

public class Design_HashSet {
    private Integer[][] bucket;
    private final int SIZE = 7;
    private final int INITIAL_BUCKET_SIZE = 2;

    public void MyHashSet(){
        bucket = new Integer[SIZE][];
        for(int i = 0; i < SIZE; i++){
            bucket[i] = null;
        }
    }

    private int hash(int key) {return (key * 23) % SIZE;}

    public void add(int key){
        int hash = hash(key);
        Integer[] temp = bucket[hash];

        if(temp == null){
            temp = new Integer[INITIAL_BUCKET_SIZE];
            temp[0] = key;
            bucket[hash] = temp;
            return;
        }

        int nullIndex = -1;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != null && temp[i].equals(key)){
                return;
            }
            if(temp[i] == null && nullIndex == -1){
                nullIndex = i;
            }
        }

        if(nullIndex != -1){
            temp[nullIndex] = key;
            return;
        }

        Integer[] newTemp = Arrays.copyOf(temp, (int) (temp.length * 1.5));
        newTemp[temp.length] = key;
        bucket[hash] = newTemp;
    }

    public void remove(int key){
        int hash = hash(key);
        Integer[] temp = bucket[hash];

        if (temp != null){
            for(int i = 0; i < temp.length; i++){
                if(temp[i] != null && temp[i].equals(key)){
                    temp[i] = null;
                    return;
                }
            }
        }
    }

    public boolean contains(int key){
        int hash = hash(key);
        Integer[] temp = bucket[hash];

        if(temp != null){
            for(int i = 0; i < temp.length; i++){
                if(temp[i] != null && temp[i].equals(key)) return true;
            }
        }
        return false;
    }
//    Solution using Nodes
//    private final int SIZE = 7;
//    private List<Node> internal;
//
//    static class Node{
//        int value;
//        Node next;
//        Node(int value) {
//            this.value = value;
//            this.next = null;
//        }
//    }
//
//    public MyHashSet(){
//        internal = new ArrayList<>(SIZE);
//        for(int i = 0; i < SIZE; i++) internal.add(null);
//    }
//
//    private int hash(int key){ return (key * 23) % SIZE; }
//
//    public void add(int key){
//        int hash = hash(key);
//        Node temp = internal.get(hash);
//
//        Node prev = null;
//        while (temp != null) {
//            if (temp.value == key) return;
//            prev = temp;
//            temp = temp.next;
//        }
//
//        Node newNode = new Node(key);
//        if(prev == null) internal.set(hash, newNode);
//        else prev.next = newNode;
//    }
//
//    public void remove(int key){
//        int hash = hash(key);
//        Node temp = internal.get(hash);
//        Node prev = null;
//
//        while(temp != null){
//            if(temp.value == key){
//                if(prev == null) internal.set(hash, temp.next);
//                else prev.next = temp.next;
//                return;
//            }
//            prev = temp;
//            temp = temp.next;
//        }
//    }
//
//    public boolean contains(int key){
//        int hash = hash(key);
//        Node temp = internal.get(hash);
//
//        while(temp != null){
//            if(temp.value == key) return true;
//            temp = temp.next;
//        }
//        return false;
//    }

    public static void main(String[] args){
    }
}
