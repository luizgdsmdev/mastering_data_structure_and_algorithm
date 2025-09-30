package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graphs {
    private HashMap<String, List<String>> myGraph;
    Graphs(){
        myGraph = new HashMap<String, List<String>>();
    }

    public boolean addVertex(String vertex){
        if(myGraph.get(vertex) != null) return false;

        myGraph.put(vertex, new ArrayList<String>());
        return true;
    }

    public boolean removeNode(String vertex){
        if(myGraph.get(vertex) == null) return false;

        List<String> vertexEdges = new ArrayList<>(myGraph.get(vertex));
        for(String edge: vertexEdges){
            System.out.println(edge);
            myGraph.get(edge).remove(vertex);
        }
        myGraph.remove(vertex);

        return true;
    }

    public boolean setEdge(String vertex, List<String> edgeList){
        if(myGraph.get(vertex) == null) return false;

        List<String> originalEdges = new ArrayList<>(myGraph.get(vertex));
        List<String> currentEdges = myGraph.get(vertex);
        for(String edge: edgeList){
            //Edge case for roll back when one of the edges points to a
            //Non-existing vertex. In this case, remove any of the edges added in
            //this call and return to original listing.
            if(myGraph.get(edge) == null){
                currentEdges.clear();
                currentEdges.addAll(originalEdges);

                return false;
            }else{
                if(edge != vertex){//Filter to avoid one pointing to itself
                    if(!myGraph.get(vertex).contains(edge)){
                        myGraph.get(vertex).add(edge);
                    }

                    if(!myGraph.get(edge).contains(vertex)){
                        myGraph.get(edge).add(vertex);
                    }
                }
            }
        }
        return true;
    }

    public boolean removeEdge(List<String> edgeList){
        if(edgeList.isEmpty()) return false;

        List<String> edgeToRemove = new ArrayList<String>(edgeList);
        for(String edge: edgeToRemove){
            if(myGraph.get(edge) != null){
                List<String> tempList = new ArrayList<>(myGraph.get(edge));

                for(String lastEdge: tempList){
                    myGraph.get(lastEdge).remove(edge);
                    myGraph.get(edge).remove(lastEdge);
                }
            }
        }
        return true;
    }

    public List<String> getEdges(String vertex){
        if(myGraph.get(vertex) == null) return null;
        return myGraph.get(vertex);
    }

    public void getGraph(){
        System.out.println(myGraph);
    }
}
