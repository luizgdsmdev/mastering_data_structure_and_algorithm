package DoublylinkedList;


public class DoublylinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node{
        public int value;
        public Node nextNode;
        public Node prevNode;

        Node(int value){
            this.value = value;
        }
    }


    DoublylinkedList(int value){
        Node newNode = new Node(value);
        newNode.nextNode = null;
        newNode.prevNode = null;
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public boolean append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            newNode.nextNode = null;
            newNode.prevNode = null;
            head = newNode;
            tail = newNode;
        }

        if(length == 1){
            head.nextNode = newNode;
            newNode.prevNode = head;
            tail = newNode;
        }else{
            tail.nextNode = newNode;
            newNode.prevNode = tail;
            tail = newNode;
        }

        length++;
        return true;
    }

    public Node removeLast(){
        if(length == 0) return null;

        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = temp.prevNode;
            tail.nextNode = null;
            temp.prevNode = null;
        }

        length--;
        return temp;
    }

    public boolean prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            newNode.nextNode = null;
            newNode.prevNode = null;
            head = newNode;
            tail = newNode;
        }

        if(length == 1){
            newNode.prevNode = null;
            newNode.nextNode = tail;
            tail.prevNode = newNode;
            head = newNode;
        }else{
            newNode.nextNode = head;
            head.prevNode = newNode;
            newNode.prevNode = null;
            head = newNode;
        }

        length++;
        return true;
    }

    public Node removeFirst(){
        if(length == 0) return null;

        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.nextNode;
            head.prevNode = null;
            temp.nextNode = null;
        }

        length--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index > (length - 1)) return null;
        if(index == 0) return head;
        if(index == (length - 1)) return tail;

        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.nextNode;
        }

        return temp;
    }

    public boolean set(int index, int value){
        if(index < 0 || index > (length - 1)) return false;
        if(index == 0){
            head.value = value;
        }else if(index == (length - 1)){
            tail.value = value;
        }else{
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.nextNode;
            }
            temp.value = value;
        }
        return true;

    }

    public boolean insert(int index, int value){
        if(index < 0 || index > (length - 1)) return false;

        Node newNode = new Node(value);
        Node temp = get(index);
        if(index == 0){
            prepend(value);
        }else{
            Node prev = temp.prevNode;
            newNode.nextNode = temp;
            newNode.prevNode = prev;
            temp.prevNode = newNode;
            prev.nextNode = newNode;
        }

        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index > (length - 1)) return null;
        if(index == 0) return removeFirst();
        if(index == (length - 1)) return removeLast();

        Node temp = get(index);
        Node prev = temp.prevNode;
        prev.nextNode = temp.nextNode;
        temp.nextNode.prevNode = prev;
        temp.nextNode = null;
        temp.prevNode = null;

        length--;
        return temp;
    }

    public void getHead(){
        if(head == null) System.out.println("Head: null");
        else System.out.println("Head: " + head.value);
    }

    public void getTail(){
        if(length == 0) System.out.println("Tail: null");
        else System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        if(length == 0) System.out.println("Length: 0");
        else System.out.println("Length: " + length);
    }

    public void getDoublyLinkedList(){
        if(length == 0) System.out.println("Empty Doubly linked list.");
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
    }



//    Palindrome Checker ( ** Interview Question)
//    Write a method to determine whether a given doubly linked list reads the same forwards and backwards.
//    For example, if the list contains the values [1, 2, 3, 2, 1], then the method should return true, since the list is a palindrome.
//    If the list contains the values [1, 2, 3, 4, 5], then the method should return false, since the list is not a palindrome.
//
//    Method name: isPalindrome
//    Return Type: boolean

    public boolean isPalindrome(){
        Node start = head;
        Node end = tail;

        while(head != tail){
            if(head.value != tail.value){
                return false;
            }
            head = head.nextNode;
            tail = tail.prevNode;
        }
        return true;
    }

//    Reverse ( ** Interview Question)
//    Implement a method called reverse() that reverses the order of the nodes in the list.
//    This method should reverse the order of the nodes in the list by manipulating the pointers of each node,
//    not by swapping the values within the nodes.
//
//    Method Signature:
//    public void reverse()
//
//    Output:
//    No explicit output is returned. However, the method should modify the doubly linked list such that the
//    order of the nodes is reversed.
//
//    Constraints:
//    The doubly linked list may be empty or have one or more nodes.
//
//    Example:
//    Consider the following doubly linked list:
//    Head: 1
//    Tail: 5
//    Length: 5
//    Doubly Linked List: 1 <-> 2 <-> 3 <-> 4 <-> 5
//    After calling reverse(), the list should be:
//    Head: 5
//    Tail: 1
//    Length: 5
//    Doubly Linked List: 5 <-> 4 <-> 3 <-> 2 <-> 1
    public void reverse() {
       Node crr = head;
       Node temp = null;

       while(crr != null){
           temp = crr.prevNode;
           crr.prevNode = crr.nextNode;
           crr.nextNode = temp;
           crr = crr.prevNode;
       }

       temp = head;
       head = tail;
       tail = temp;
    }
}
