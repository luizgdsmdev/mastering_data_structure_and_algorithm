package DoublylinkedList;

public class Main {

    public static void main(String[] args){
    DoublylinkedList myDoublylinkedList = new DoublylinkedList(1);
    myDoublylinkedList.append(2);
    myDoublylinkedList.append(3);
    myDoublylinkedList.append(2);
    myDoublylinkedList.append(1);

        System.out.println(myDoublylinkedList.isPalindrome());
    }
}
