package stack;

public class Stack {
    private Node top;
    private int height;

    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    Stack(int value){
        top = new Node(value);
        top.next = null;
        height = 1;
    }

    public boolean push(int value){
        if(height == 0){
            top = new Node(value);
            top.next = null;
        }else{
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }
        height++;
        return true;
    }

    public Node pop(){
        if(height == 0) return null;

        Node temp = top;
        if(height == 1) top = null;
        else top = top.next;
        height--;
        return temp;
    }

    public void getTop(){
        if(height == 0) System.out.println("Top: null");
        if(height >= 1) System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        if(height == 0) System.out.println("Length: null");
        if(height >= 1) System.out.println("Length: " + height);
    }

    public void getStack(){
        if(height == 0) System.out.println("Stack: null");
        if(height >= 1){
            Node temp = top;

            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
}
