package Heap;

public class Main {

    public static void main(String[] args){

        Heap myHeap = new Heap();
        myHeap.insertMin(2);
        myHeap.insertMin(1);
        myHeap.insertMin(3);
        myHeap.insertMin(5);
        myHeap.insertMin(6);
        myHeap.insertMin(4);





        System.out.println(myHeap.getHeap());
    }
}
