package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){
        Graphs myGraph = new Graphs();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.setEdge("A", List.of("B", "C"));
        myGraph.setEdge("B", List.of("A", "D"));
        myGraph.setEdge("C", List.of("B"));

        myGraph.removeEdge(List.of("C", "A"));

        myGraph.getGraph();
    }
}
