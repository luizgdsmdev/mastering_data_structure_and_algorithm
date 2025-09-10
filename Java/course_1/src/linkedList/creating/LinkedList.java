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

    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Integer getHead() {
        if (head == null) return null;
        return head.value;
    }

    public Integer getTail(){
        if (tail == null) return null;
        return tail.value;
    }

    public Integer getLength(){
        return length;
    }

    public void appendNode(int value){
        //If the linkedList is empty, Head and Tail points to this new Node
        //need to create a new Node
        //Current Tail points to this new Node
        //Update the Tail pointing to this new Node
        Node newnode = new Node(value);

        if(length <= 0){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            tail = newnode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;

        if(length == 1){
            head = null;
            tail = null;
            length = 0;

            return null;
        }

        Node temp = head;
        //[1,2,3]
        while(temp.next == tail){
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        length--;

        return temp;
    }

}
