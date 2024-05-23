package Graphs;

import java.util.ArrayList;

public class path_From_source {
     static class Edge {
        int s; // source
        int d; // destination

        public Edge(int s, int d) {
            this.s = s;
            this.d = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        int v = graph.length; // Number of vertices
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>(); // Initialize each ArrayList
        }
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void AllPath(ArrayList<Edge>Graph[],int source,int destination,String path){
        if(source==destination){
            System.out.println(path+destination);
            return;            
        }
        for(int i=0;i<Graph[source].size();i++){
            Edge e=Graph[source].get(i);
            AllPath(Graph, e.d, destination, path+source);
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        AllPath(graph, 5, 1, "");
    }
}
