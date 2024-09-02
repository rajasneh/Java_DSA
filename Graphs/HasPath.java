package Graphs;

import java.util.ArrayList;

public class HasPath {
    static class Edge {
        int s; // source
        int d; // destination
        int w; // weight

        public Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        int v = 7; // Number of vertices
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>(); // Initialize each ArrayList
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }
    public static boolean haspath(ArrayList<Edge>graph[],int src,int dest,boolean isVis[]){
        if (src==dest) {
            return true;
        }
        isVis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if (!isVis[e.d] && haspath(graph, e.d, dest, isVis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /* 

               1--------3
              /         |\    
             /          |  \
            0           |   5-----6
             \          |   /
               \        | /
                 2------4/
        */
        int V=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];
        createGraph(graph);
         System.out.println(haspath(graph, 0, 5, new boolean[V]));
    }
}