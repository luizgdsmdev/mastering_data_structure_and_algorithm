package linkedList.creating;


//Basic structure for a linked list
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node{
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


    //Given an LinkedList (ex: [1 -> 2 -> 3 -> 4 -> 5 -> null]), you must find the
    //middle node of the list.
    //You **don't have the length** attribute of the linked list.
    //Rules:
    //  - You can **only loop once** through the linked list;
    //  - You **cannot count** how many nodes exist in the linked list.
    public Node findMiddleNode(){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
        System.out.println(slow.value);
        return slow;
    }








    //Appending value to the end of the LinkedList, O(1)
    public boolean appendLast(int value){
        Node newNode = new Node(value);
        if(length == 0){
            tail = newNode;
            head = newNode;
            length++;
            return true;
        }
        if(length == 1){
            head.next = newNode;
            tail = newNode;
            length++;
            return true;
        }

        tail.next = newNode;
        tail = newNode;

        length++;
        return true;
    }

    //Removing element from the end of the LinkedList O(n)
    public boolean removelast(){
        if(length == 0) return false;
        if(length == 1){
            head = null;
            tail = null;
            length--;
            return true;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;

        length--;
        return true;
    }

    //Adding element to the beginning of the LinkedList, O(1)
    public boolean appendFirst(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
            length++;
            return true;
        }

        newNode.next = head;
        head = newNode;

        length++;
        return true;
    }

    //Removing from the beginning of the LinkedList, O(1)
    public boolean removFirst(){
        if(length == 0) return false;
        if(length == 1){
            head = null;
            tail = null;
            length--;
            return true;
        }

        head = head.next;
        length--;
        return true;
    }

    //Adding a node into a specific position in the LinkedList sequence (by index), O(n)
    public boolean addNode(int index, int value){
        if(index <= 0 || index > length) return false;
        if(index == 1){
            appendFirst(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = head;
        if(index == length){
            while (temp.next != tail){
                temp = temp.next;
            }
            newNode.next = tail;
            temp.next = newNode;
            length++;
            return true;
        }

        for(int i = 1; i < (index - 1); i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    //Removing a specific element from the LinkedList sequence (by index), O(n)
    public boolean removeNode(int index){
        if(index <= 0 || index > length) return false;
        if(index == 1){
            removFirst();
            return true;
        }
        if(index == length){
            removelast();
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

    //Return the specific Node value (by index), O(n)
    public Node getNode(int index){
        if(index <= 0 || index > length) return null;
        if(index == 1) return head;
        if(index == length) return tail;

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //Reverse all node of the LinkedLists, O(n)
    public void reverseLinkedList(){
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
