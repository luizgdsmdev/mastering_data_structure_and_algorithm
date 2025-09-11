package linkedList.creating;

//Basic structure for a linked list
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

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

    public void appendLast(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length <= 0) return null;

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

    public void appendFirst(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void removeFirst(){
        if(length == 0){
            System.out.println("Linked list already empty");
        }else if(length == 1){
            head = null;
            tail = null;
            length = 0;
        }else{
            Node temp = head.next;
            head = temp;
            temp = null;
            length--;
        }
    }

    public Node getNode(int index){
        if(index <= 0 || index > length) return null;
        if(length == index) return tail;

        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean setNode(int index, int value){
        if(index <= 0 || index > length) return false;
        if(index == length){
            tail.value = value;
            return true;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        temp.value = value;
        return true;
    }

    public boolean insertNode(int index, int value){
        Node newNode = new Node(value);

        if(index <= 0 || index > length) return false;
        if(index == 1){
            appendFirst(value);
            return true;
        }


        Node temp = head;
        for(int i = 1; i < (index - 1); i++){ temp = temp.next; }

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean removeNode(int index){
        if(index <= 0 || index > length) return false;
        if(index == 1){ removeFirst(); return true;}
        if(index == length){ removeLast(); return true;}

        Node toExclude = head;
        Node prev = new Node(0);
        for (int i = 1; i < index; i++){
            if((index - 1) == i){
                prev = toExclude;
            }
            toExclude = toExclude.next;
        }

        prev.next = toExclude.next;
        toExclude.next = null;
        length--;
        return true;
    }




    public void getHead(){
        if(head == null){
            System.out.println("Empty Linked list.");
        }else{
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail(){
        if(tail == null){
            System.out.println("Empty Linked list.");
        }else{
            System.out.println("tail: " + tail.value);
        }
    }

    public void getlength(){
        if(length == 0){
            System.out.println("Empty Linked list.");
        }else{
            System.out.println("length: " + length);
        }
    }

    public void getlinkedList(){
        Node temp = head;
        if(length == 0){
            System.out.println("Empty Linked list.");
        }else{
            while (temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
}
