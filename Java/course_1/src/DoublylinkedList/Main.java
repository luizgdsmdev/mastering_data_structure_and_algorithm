package DoublylinkedList;

public class Main {

    public static void main(String[] args){
    DoublylinkedList myDoublylinkedList = new DoublylinkedList(0);
    myDoublylinkedList.append(1);
    myDoublylinkedList.append(2);
    myDoublylinkedList.append(3);

    System.out.println("---------------------");
    myDoublylinkedList.getHead();
    myDoublylinkedList.getTail();
    myDoublylinkedList.getLength();
    myDoublylinkedList.getDoublyLinkedList();
    }
}
