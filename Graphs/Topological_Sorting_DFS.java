package Graphs;

import java.util.*;

public class Topological_Sorting_DFS {
    static class Edge {
        int s; // source
        int d; // destination

        public Edge(int s, int d) {
            this.s = s;
            this.d = d;
        }
    } 
    
    static void createGraph(ArrayList<Edge>[] graph) {
        int v = 7; // Number of vertices
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>(); // Initialize each ArrayList
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6));
    }

    public static void toposort(ArrayList<Edge>Graph[]){
        Stack<Integer>s=new Stack<>();
        boolean isvis[]=new boolean[Graph.length];

        for(int i=0;i<Graph.length;i++){
            if(!isvis[i]){
                topsortutil(Graph,i,isvis,s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
    public static void topsortutil(ArrayList<Edge>Graph[],int curr,boolean isvis[],Stack<Integer>s){
        isvis[curr]=true;
        for(int i=0;i<Graph[curr].size();i++){
            Edge e=Graph[curr].get(i);
            if(!isvis[e.d]){
                topsortutil(Graph, e.d, isvis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String args[]){
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];
        createGraph(graph);

        toposort(graph);
    }
}
