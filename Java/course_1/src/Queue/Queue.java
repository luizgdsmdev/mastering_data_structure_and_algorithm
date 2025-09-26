package Queue;

public class Queue {
    private Node top;
    private Node bottom;
    private int heigth;

    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    Queue(int value){
        Node newNode = new Node(value);
        top = newNode;
        bottom = newNode;
        bottom.next = null;
        heigth = 1;
    }

    public boolean enQueue(int value){
        Node newNode = new Node(value);
        if(heigth == 0){
            top = newNode;
            bottom = newNode;
            bottom.next = null;
        }else{
            bottom.next = newNode;
            bottom = newNode;
        }
        heigth++;
        return true;
    }

    public Node deQueue(){
        if(heigth == 0) return null;

        Node temp = top;
        if(heigth == 1){
            top = null;
            bottom = null;
        }else{
            top = top.next;
            temp.next = null;
        }

        heigth--;
        return temp;
    }


    public void getTop(){
        if(heigth == 0) System.out.println("Top: null");
        if(heigth >= 1) System.out.println("Top: " + top.value);
    }

    public void getBottom(){
        if(heigth == 0) System.out.println("Bottom: null");
        if(heigth >= 1) System.out.println("Bottom: " + bottom.value);
    }

    public void getHeigth(){
        if(heigth == 0) System.out.println("Heigth: null");
        if(heigth >= 1) System.out.println("Heigth: " + heigth);
    }

    public void getQueue(){
        if(heigth == 0) System.out.println("Queue: null");
        else{
            Node temp = top;
            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
}
