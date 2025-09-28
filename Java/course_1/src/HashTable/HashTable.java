package HashTable;
import java.util.ArrayList;
import java.util.Map;

public class HashTable {
    private final int hashSize = 7;
    Node[] dataMap;

    class Node{
        private String key;
        private int value;
        private Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public class elementNode{
        public String nodeKey;
        public int nodeValue;

        elementNode(String key, int value){
            this.nodeKey = key;
            this.nodeValue = value;
        }
    }

    HashTable(int size){
        this.dataMap = new Node[size];
    }

    private int hash(@org.jetbrains.annotations.NotNull String key){
        char[] arraykey = key.toCharArray();
        int hash = 0;

        for(char partition: arraykey){
            hash += (int) partition;
        }

        //Random number 23 for basic hashing. Prime numbers avoid many possible collisions.
        hash = (hash * 23) % hashSize;
        return hash;
    }

    public boolean set(String key, int value){
        int keyHash = hash(key);
        Node newNode =  new Node(key, value);

        if(dataMap[keyHash] != null){
            Node temp = dataMap[keyHash];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }else{
            dataMap[keyHash] = newNode;
        }

        return true;
    }

    public ArrayList<elementNode> get(String key){
        int hashKey = hash(key);
        ArrayList<elementNode> values = new ArrayList<elementNode>();
        if(dataMap[hashKey] == null) return values;

        Node temp = dataMap[hashKey];
        while(temp != null){
            if(temp.key.equals(key)) values.add(new elementNode(temp.key, temp.value));
            temp = temp.next;
        }

        return values;
    }

    public boolean contains(String key){
        int hash = hash(key);

        Node temp = dataMap[hash];
        while(temp != null){
            if(temp.key.equals(key)) return true;
            temp = temp.next;
        }

        return false;
    }

    public ArrayList<String> getKeys(){
        ArrayList<String> keysListing = new ArrayList<String>();
        for(int i = 0; i < dataMap.length; i++){
            if(dataMap[i] != null){
                Node temp = dataMap[i];
                while(temp != null){
                    keysListing.add(temp.key);
                    temp = temp.next;
                }
            }
        }

        return keysListing;
    }

    public void getHashTable(){
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            System.out.println("[" + i + "]:");
            while(temp != null){
                System.out.println("{ " + temp.key + ": " + temp.value + " }");
                temp = temp.next;
            }
        }
    }
}
