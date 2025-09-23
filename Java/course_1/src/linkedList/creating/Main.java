package linkedList.creating;

public class Main {


    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.appendLast(2);
        myLinkedList.appendLast(3);
        myLinkedList.appendLast(4);
        myLinkedList.appendLast(5);
        myLinkedList.appendLast(6);

        myLinkedList.reverseBetween(2,4);
        myLinkedList.getlinkedList();

    }
}
