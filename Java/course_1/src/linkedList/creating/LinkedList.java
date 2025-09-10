package linkedList.creating;

//Basic structure for a linked list
public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

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

    public Node appendLast(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;

        return tail;
    }

    public Node removeLast(){

        if(length == 0) return null;

        if(length == 1){
            head = null;
            tail = null;
            length = 0;
            return null;
        }else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            length--;
            return temp;
        }

    }

    public void printLinkedList(){
        if(length == 0) System.out.println("Empty Linked list.");
        else {
            Node temp = head;
            for (int i = 0; i < length; i++){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public void getHead(){
        if(head == null) System.out.println("Null");
        else{
            System.out.println(head.value);
        }
    }

    public void getTail(){
        if(tail == null) System.out.println("Null");
        else{
            System.out.println(tail.value);
        }
    }

    public void getLenght(){
        System.out.println(length);
    }

}
