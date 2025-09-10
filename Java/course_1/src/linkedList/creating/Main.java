package linkedList.creating;

public class Main {


    public static void main(String[] args){
        //create the append
        //Create the remove
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.appendNode(2);
        myLinkedList.appendNode(3);
        myLinkedList.appendNode(4);

        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getLength());
        System.out.println("-----------");
        myLinkedList.removeLast();
        myLinkedList.removeLast();
        myLinkedList.removeLast();

        System.out.println("-----------");
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getLength());
        myLinkedList.removeLast();


        System.out.println("-----------");
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getLength());


        myLinkedList.appendNode(4);
        System.out.println("-----------");
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getLength());


        myLinkedList.removeLast();
        System.out.println("-----------");
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getTail());
        System.out.println(myLinkedList.getLength());



    }

}
