package Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    Heap(){
        this.heap = new ArrayList<Integer>();
    }

    //Insert a new node reordering the sequence to the highest value always on top
    public boolean insert(int value){
        if(heap.isEmpty()){//skip non-necessary loop for the first node
            heap.add(value);
            return true;
        }

        heap.add(value);
        int valueIndex = heap.size() - 1;

        //Bubble-up loop to keep higher numbers at top
        while(true){
            Integer parent = getParent(valueIndex);
            if(parent != null && value > heap.get(parent) && valueIndex > 0){
                swap(valueIndex, parent);
                valueIndex = parent;
            }else{
                return true;
            }
        }
    }

    //Remove a node and re-order the sequences below
    //Act by removing the root, switching it for the last node and then bubble-down the new root
    //until find final position (keeping it always complete for a Heap structure)
    public Integer remove(){
        if(heap.isEmpty()) return null;
        if(heap.size() == 1) return heap.removeFirst();

        int output = heap.getFirst();
        heap.set(0, heap.removeLast());
        Sink(0);

        return output;
    }

    public void Sink(int index){
        int max = index;

        while(true){
            Integer right = getRightChild(index);
            Integer left = getLeftChild(index);

            if(right != null && right < heap.size() && heap.get(index) < heap.get(right)){
                max = right;
            }if(left != null && left < heap.size() && heap.get(index) < heap.get(left)){
                max = left;
            }

            if(max != index){
                swap(max, index);
                index = max;
            }else{
                return;
            }
        }
    }

    //Swap positions between two nodes
    //Private for secure the structure from outside access changes
    private boolean swap(int node, int node2){
        if(node < 0 || node > heap.size() - 1 || node2 < 0 || node2 > heap.size() - 1) return false;
        int temp = heap.get(node);
        heap.set(node, heap.get(node2));
        heap.set(node2, temp);

        return true;
    }

    //Return the index of the child, or null if it's invalid
    public Integer getRightChild(int index){
        if(index < 0 || index > heap.size() - 1) return null;
        int childIndex = (index * 2) + 2;
        if(childIndex >= 0 && childIndex < heap.size()) return childIndex;
        else return null;
    }

    //Return the index of the child, or null if it's invalid
    public Integer getLeftChild(int index) {
        if (index < 0 || index > heap.size() - 1) return null;
        int childIndex = (index * 2) + 1;
        if (childIndex >= 0 && childIndex < heap.size()) return childIndex;
        else return null;
    }

    //Return the index of the parent node
    public Integer getParent(int index){
        if(index < 0 || index > heap.size() - 1) return null;
        return (index - 1)/2;
    }

    //Return a copy of the heap
    public List<Integer> getHeap(){
        return new ArrayList<>(this.heap);
    }

    public Integer getNodeValue(int index){
        if(heap.isEmpty() || index < 0 || index > heap.size() - 1) return null;

        return heap.get(index);
    }

    public int getSize(){
        return heap.size();
    }

    //--------------------------------------------
    //Version or min-values

    //Favor small values for the top of the heap
    public boolean insertMin(int value){
        if(heap.isEmpty()){
            heap.add(value);
            return true;
        }

        heap.add(value);
        int valueIndex = heap.size() - 1;

        while(true){
            Integer parent = getParent(valueIndex);

            if(parent != null && heap.get(valueIndex) < heap.get(parent)){
                swap(valueIndex, parent);
                valueIndex = parent;
            }else{
                break;
            }
        }
        return true;
    }

    //Remove the lower element and re-order the structure
    public Integer removeMin(){
        if(heap.isEmpty()) return null;
        Integer output = heap.getFirst();
        heap.set(0, heap.removeLast());
        SinkMin(0);

        return output;
    }

    //Re-ordering the elements after removal on removeMin() method
    public void SinkMin(int index){
        int max = index;
        while(true){
            Integer right = getRightChild(index);
            Integer left = getLeftChild(index);

            if(left != null && heap.get(index) > heap.get(left)){
                max = left;
            }else if(right != null && heap.get(index) > heap.get(right)){
                max = right;
            }

            if(max != index){
                swap(max, index);
                index = max;
            }else{
                break;
            }


        }
    }
}