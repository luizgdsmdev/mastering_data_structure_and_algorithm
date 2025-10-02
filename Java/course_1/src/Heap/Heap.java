package Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    Heap(){
        this.heap = new ArrayList<>();
    }

    public boolean insert(int value){
        heap.add(value);
        int crrIndex = heap.size() - 1;

        while(heap.get(crrIndex) > heap.get(getParent(crrIndex))){
            swap(crrIndex, getParent(crrIndex));
            crrIndex = getParent(crrIndex);
        }

        return true;
    }

    public boolean swap(int first, int last){
        if(first < 0 || first > heap.size() || last < 0 || last > heap.size()) return false;

        int temp = heap.get(last);
        heap.set(last, heap.get(first));
        heap.set(first, temp);

        return true;
    }

    public boolean remove(){
        int first = heap.getFirst();
        int last = heap.getLast();
        heap.set(0, last);
        heap.removeFirst();
        boolean SinkResponse = Sink(0);

        //BackUp in case Sink returns false
        if(SinkResponse) return true;
        else{
            heap.set(0, first);
            heap.add(last);
            return false;
        }
    }

    public boolean Sink(int index){
        while(true){
            Integer right = getRightChild(index);
            Integer left = getLeftChild(index);

            if(right < heap.size() && heap.get(index) < heap.get(right)){
                swap(index, right);
                index = right;
            }else if(left < heap.size() && heap.get(index) < heap.get(left)){
                swap(index, left);
                index = left;
            }else{
                break;
            }
        }
        return true;

    }

    public int getParent(int index){
        return (index - 1)/2;
    }

    //Return index
    public Integer getLeftChild(int index){
        if(index > heap.size() || index < 0) return null;
        return (index * 2) + 1;
    }

    //Return index
    public Integer getRightChild(int index){
        if(index > heap.size() || index < 0) return null;
        return (index * 2) + 2;
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

}
