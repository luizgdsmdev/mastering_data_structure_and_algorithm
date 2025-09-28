package HashTable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        HashTable myHashTable = new HashTable(7);
        myHashTable.set("Notebook", 10000);
        myHashTable.set("Notebook", 70000);
        myHashTable.set("Clock", 70000);
        myHashTable.set("Clock", 760000);
        myHashTable.set("CPU", 70000);
        myHashTable.set("RAM", 90000);

        System.out.println("---------------------------");
        System.out.println("Elements listed with get() method:");
        ArrayList<HashTable.elementNode> elementsList = myHashTable.get("Notebook");
        for(HashTable.elementNode element: elementsList){
            System.out.println(element.nodeKey + ": " + element.nodeValue);
        }
        System.out.println();



        System.out.println("---------------------------");
        System.out.println("Return of the contais() method:");
        System.out.println(myHashTable.contains("Notebook"));
        System.out.println();



        System.out.println("---------------------------");
        System.out.println("Return of the getKeys() method:");
        System.out.println(myHashTable.getKeys());
        System.out.println();



        System.out.println("---------------------------");
        System.out.println("All elements in memory with getHashTable() method:");
        myHashTable.getHashTable();
        System.out.println();

    }
}
