package Heap;

public class Main {

    public static void main(String[] args){

        Heap myHeap = new Heap();
        myHeap.insert(1);
        myHeap.insert(2);
        myHeap.insert(3);
        myHeap.insert(4);
        myHeap.insert(5);

        myHeap.remove();



        System.out.println(myHeap.getHeap());
    }
}
