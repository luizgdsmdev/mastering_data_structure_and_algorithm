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
