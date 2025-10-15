package _706_Design_HashMap;

//706. Design HashMap
//Easy
//Design a HashMap without using any built-in hash table libraries.
//Implement the MyHashMap class:
//
//MyHashMap() initializes the object with an empty map.
//void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
//int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
//void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
//
//Example 1:
//Input
//["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
//[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
//Output
//[null, null, null, 1, -1, null, 1, null, -1]
//
//Explanation
//MyHashMap myHashMap = new MyHashMap();
//myHashMap.put(1, 1); // The map is now [[1,1]]
//myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
//myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
//myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
//myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
//myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
//myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
//myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
//
//Constraints:
//0 <= key, value <= 106
//At most 104 calls will be made to put, get, and remove.

// -> Runtime: 42ms, beats 10.47% of submissions.
// -> Memory Usage: 45.59MB, beats 99.17% of submissions.

import java.util.ArrayList;
import java.util.List;

public class Design_HashMap {
    private List<Node> bucket;
    private final int SIZE = 7;

    class Node{
        int key;
        int value;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public MyHashMap() {
        bucket = new ArrayList<>(SIZE);
        for(int i = 0; i < SIZE; i++) bucket.add(i, null);
    }

    public int hash(int key){ return (key * 23) % SIZE; }

    public void put(int key, int value) {
        int hash = hash(key);
        Node temp = bucket.get(hash);

        while(temp != null){
            if(temp.key == key){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = bucket.get(hash);
        bucket.set(hash, newNode);
    }

    public int get(int key) {
        int hash = hash(key);
        Node temp = bucket.get(hash);

        while(temp != null){
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }

        return -1;
    }

    public void remove(int key) {
        int hash = hash(key);
        Node temp = bucket.get(hash);
        Node prev = null;

        while(temp != null){
            if(temp.key == key){
                if(prev == null) bucket.set(hash, temp.next);
                else{
                    prev.next = temp.next;
                    temp.next = null;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        MyHashMap myHashMap = new MyHashMap();
    }
}
