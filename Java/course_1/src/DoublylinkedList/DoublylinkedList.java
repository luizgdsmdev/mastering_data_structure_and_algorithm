package DoublylinkedList;


public class DoublylinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node{
        public int value;
        public Node next;
        public Node prev;

        Node(int value){
            this.value = value;
        }
    }


    DoublylinkedList(int value){
        Node newNode = new Node(value);
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public boolean append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;
        }

        if(length == 1){
            head.next = newNode;
            newNode.prev = head;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
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
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }

        length--;
        return temp;
    }

    public boolean prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;
        }

        if(length == 1){
            newNode.prev = null;
            newNode.next = tail;
            tail.prev = newNode;
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
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
            head = head.next;
            head.prev = null;
            temp.next = null;
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
            temp = temp.next;
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
                temp = temp.next;
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
            Node prev = temp.prev;
            newNode.next = temp;
            newNode.prev = prev;
            temp.prev = newNode;
            prev.next = newNode;
        }

        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index > (length - 1)) return null;
        if(index == 0) return removeFirst();
        if(index == (length - 1)) return removeLast();

        Node temp = get(index);
        Node prev = temp.prev;
        prev.next = temp.next;
        temp.next.prev = prev;
        temp.next = null;
        temp.prev = null;

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
            temp = temp.next;
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
            head = head.next;
            tail = tail.prev;
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
       Node temp = null;
       Node crr = head;

       while(crr != null){
           temp = crr.prev;
           crr.prev = crr.next;
           crr.next = temp;
           crr = crr.prev;
       }
        temp = head;
        head = tail;
        tail = temp;
    }

//    Partition List ( ** Interview Question)
//    Write a method called partitionList that rearranges the nodes in a doubly linked list so that all nodes
//    with values less than a given number x come before nodes greater than or equal to x.
//    This must be done by relinking the existing nodes (not by creating new ones). The method should update both
//    .next and .prev pointers correctly.
//    The relative order of nodes within each partition must be preserved.
//
//    Example Inputs and Outputs:
//    Input:  3 <-> 8 <-> 5 <-> 10 <-> 2 <-> 1, x = 5
//    Output: 3 <-> 2 <-> 1 <-> 8 <-> 5 <-> 10
//
//    Input: 1 <-> 2 <-> 3, x = 5
//    Output: 1 <-> 2 <-> 3
//
//    Input: 6 <-> 7 <-> 8, x = 5
//    Output: 6 <-> 7 <-> 8
    public void partitionList(int x){
        Node temp = head;
        Node dless = new Node(0);
        Node dGreat = new Node(0);
        Node less = dless;
        Node great = dGreat;

        while(temp != null){
            if(temp.value < x){
                less.next = temp;
                temp.prev = less;
                less = temp;
            }else{
                great.next = temp;
                temp.prev = great;
                great = temp;
            }
            temp = temp.next;
        }

        if(dless.next != null){
            head = dless.next;
            if(dGreat.next != null){
                less.next = dGreat.next;
                tail = great;
            }else{
                tail = less;
            }
        }else{
            head = dGreat.next;
            tail = great;
        }
        tail.next = null;
    }

//    Reverse Between ( ** Interview Question)
//    Reverse a portion of a doubly linked list (DLL).
//    Write a method that takes two indices (startIndex, endIndex) and reverses the nodes between those indices.
//    The original list must be modified in place.
//
//    Constraints:
//    startIndex and endIndex are zero-based.
//    The list may be empty or contain a single node.
//    If startIndex == endIndex, no changes should occur.
//    You must maintain the integrity of both next and prev pointers.

    public boolean ReverseBetween(int startindex, int endIndex){
        if(length <= 1 || endIndex > (length - 1) || startindex < 0 || startindex == endIndex || startindex > endIndex) return false;

        Node dummyStart = new Node(0);
        Node dummyEnd = new Node(0);
        dummyStart.next = head;
        head.prev = dummyStart;
        Node tg = head;
        Node pTg = tg.prev;
        Node after = null;
        Node temp = null;
        tail.next = dummyEnd;
        dummyEnd.prev = tail;

        for(int i = 0; i < startindex; i++){
            pTg = tg;
            tg = tg.next;
        }

        for(int i = 0; i < (endIndex - startindex); i++){
               after = tg.next;
               temp = pTg.next;
               pTg.next = after;
               after.prev = pTg;

               tg.next = after.next;
               after.next.prev = tg;

               after.next = temp;
               temp.prev = after;
        }


        head = dummyStart.next;
        dummyEnd.prev.next = dummyEnd.next;
        tail = dummyEnd.prev;

        return true;
    }

    //Implement a method called swapPairs within the class that swaps the values of adjacent nodes in the linked list.
//The method should not take any input parameters.
//Note: This DoublyLinkedList does not have a tail pointer which will make the implementation easier.
//Also note, there is not a length attribute.
//
//Example:
//1 <-> 2 <-> 3 <-> 4
//
//should become
//2 <-> 1 <-> 4 <-> 3
//
//Your implementation should handle edge cases such as an empty linked list or a linked list with only one node.
//Note: You must solve the problem WITHOUT MODIFYING THE VALUES in the list's nodes (i.e., only the nodes' prev and next pointers may be changed.)

    public void swapPairs(){
        if(head.next == null) return;

        Node dummyHead = new Node(0);
        Node dummyTail = new Node(0);
        dummyHead.next = head;
        head.prev = dummyHead;
        tail.next = dummyTail;
        dummyTail.prev = tail;

        Node crr = head;
        Node prev = dummyHead;
        Node after = crr.next;

        while(crr != tail && crr.next != tail){
            crr.next = after.next;
            after.next.prev = crr;

            prev.next = after;
            after.prev = prev;

            after.next = crr;
            crr.prev = after;

            prev = crr;
            crr = crr.next;
            after = crr.next;
        }

        head = dummyHead.next;
        tail = dummyTail.prev;
        tail.next = null;
    }
}
