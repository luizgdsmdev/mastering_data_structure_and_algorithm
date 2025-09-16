package linkedList.creating;

public class Main {


    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.appendLast(2);
        myLinkedList.appendLast(3);
        myLinkedList.appendLast(4);
        myLinkedList.appendLast(5);


        System.out.println(myLinkedList.hasLoop());
    }
}
