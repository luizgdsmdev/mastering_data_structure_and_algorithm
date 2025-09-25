package DoublylinkedList;

public class Main {

    public static void main(String[] args){
    DoublylinkedList myDoublylinkedList = new DoublylinkedList(6);
    myDoublylinkedList.append(7);
    myDoublylinkedList.append(8);

    myDoublylinkedList.partitionList(5);
    myDoublylinkedList.getDoublyLinkedList();
    }
}
