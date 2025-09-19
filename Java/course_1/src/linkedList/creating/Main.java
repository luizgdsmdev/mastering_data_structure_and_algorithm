package linkedList.creating;

public class Main {


    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(3);
        myLinkedList.appendLast(8);
        myLinkedList.appendLast(5);
        myLinkedList.appendLast(10);
        myLinkedList.appendLast(2);
        myLinkedList.appendLast(1);

        myLinkedList.partitionList(5);
        myLinkedList.getlinkedList();

    }
}
