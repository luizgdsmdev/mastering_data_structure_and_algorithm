package linkedList.creating;


//Basic structure for a linked list
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //Append an element to the end of the LinkedList
    public boolean appendLast(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        return true;
    }

    //Remove last element from the LinkedList by looping on Nodes
    public boolean removeLast(){
        if(length == 0) return false;

        if(length == 1){
            head = null;
            tail = null;
        }else{
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
        }

        length--;
        return true;
    }

    //Append new node to the beginning of the LinkedList (head)
    public boolean appendFirst(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }

        if(length == 1){
            newNode.next = tail;
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

        length++;
        return true;
    }

    //Remove the first element from the LinkedList (head)
    public boolean removeFirst(){
        if(length == 0) return false;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            Node temp = head.next;
            head = temp;
            temp = null;
        }
        length--;
        return true;
    }

    //Get specific node from a LinkedList position
    public Node getNode(int index){
        if(length == 0) return null;
        if(index <= 0 || index > length) return null;
        if(index == 1) return head;
        if(index == length) return tail;

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //Set a specific value to a Node
    public boolean setNode(int index, int value){
        if(index <= 0 || index > length) return false;

        Node newNode = new Node(value);
        if(index == 1 && length == 1){
            head = newNode;
            tail = newNode;
            return true;
        }

        if(index == 1){
            newNode.next = head.next;
            head = newNode;
            return true;
        }else{
            Node temp = head;
            Node prev = null;
            for(int i = 1; i < index; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = newNode;
            newNode.next = temp.next;

            if(temp == tail){
                tail = newNode;
            }
            temp = null;
        }

        return true;

    }

    //Insert a new Node into a specific position
    public boolean insertNode(int index, int value){
        if(index <= 0 || index > length) return false;
        Node newNode = new Node(value);
        if(index == 1){
            newNode.next = head;
            head = newNode;
        }else{
            Node temp = head;
            Node prev = null;
            for(int i = 1; i < index; i++){
                prev = temp;
                temp = temp.next;
            }
            newNode.next = temp;
            prev.next = newNode;
        }
        length++;
        return true;
    }

    //Remove Node from a specific position
    public boolean removeNode(int index){
        if(index <= 0 || index > length) return false;
        if(index == 1){
            removeFirst();
            return true;
        }
        if(index == length){
            removeLast();
            return true;
        }

        Node temp = head;
        Node prev = null;
        for(int i = 1; i < index; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp = null;
        length--;
        return true;
    }

    //Reverse all Nodes from the existing LinkedList
    public boolean reverseLinkedList(){
        if(length == 0 || length == 1) return false;

        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        //   H              T
        //   4 -> null      1 -> 2 -> 3 ->
        //          b       t    a

        return true;
    }

    public void getHead(){
        if(length == 0){
            System.out.println("Empty LinkedList");
        }else{
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail(){
        if(length == 0){
            System.out.println("Empty LinkedList");
        }else{
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getlength(){
        if(length == 0){
            System.out.println("Empty LinkedList.");
        }else{
            System.out.println("length: " + length);
        }
    }

    public void getlinkedList(){
        if(length == 0) System.out.println("Empty LinkedList.");
        Node temp = head;

        for (int i = 0; i < length; i++){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
