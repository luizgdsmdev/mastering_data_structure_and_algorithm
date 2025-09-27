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

    public Node getTop(){//Commented for sort exerc_3, uncomment for standard use
//        if(height == 0) System.out.println("Top: null");
//        if(height >= 1) System.out.println("Top: " + top.value);
        if(top != null) return top;
        else return null;
    }

    public int getHeight(){//Commented for sort exerc_3, uncomment for standard use
//        if(height == 0) System.out.println("Length: null");
//        if(height >= 1) System.out.println("Length: " + height);
        return height;
    }

    public void getStack(){
        if(height == 0) System.out.println("Stack: empty");
        if(height >= 1){
            Node temp = top;

            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public void sortStack(Stack toSort){
        if(toSort.getHeight() <= 1) return;

        Stack newStack = new Stack(0);
        newStack.pop();

        while(toSort.getHeight() >= 0) {
            if (toSort.getHeight() == 0) break;
            Node temp = toSort.pop();
            if (newStack.getTop() != null) {
                if (temp.value < newStack.getTop().value) {
                    Node inner = newStack.pop();
                    while (inner != null && temp.value < inner.value) {
                        toSort.push(inner.value);
                        inner = newStack.pop();
                    }

                    if (inner != null) newStack.push(inner.value);
                    newStack.push(temp.value);

                } else {
                    newStack.push(temp.value);
                }
            } else {
                newStack.push(temp.value);
            }
        }

        while(newStack.getHeight() > 0){
            toSort.push(newStack.pop().value);
        }
    }

    public void enqueue(int value){
        if(height == 0){
            this.push(value);
        }else{
            Stack newStack1 = new Stack(0);
            Stack newStack2 = new Stack(0);
            newStack1.pop();
            newStack2.pop();

            newStack1 = this;

            while(newStack1.getHeight() != 0){
                newStack2.push(newStack1.pop().value);
            }
            newStack2.push(value);

            while(newStack2.getHeight() != 0){
                this.push(newStack2.pop().value);
            }
        }



    }

    public Node dequeue(){
        if(height == 0) return null;
        return this.pop();
    }

}
