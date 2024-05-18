package Graphs;

import java.util.ArrayList;

public class Cycle_directed {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
    }

    public static boolean iscycle(ArrayList<Edge>Graph[]){
        boolean isvis[]=new boolean[Graph.length];
        boolean stack[]=new boolean[Graph.length];

        for(int i=0;i<Graph.length;i++){
            if(!isvis[i]){
                if(iscycleutil(Graph,i,isvis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean iscycleutil(ArrayList<Edge>Graph[],int curr,boolean isvis[],boolean stack[]){
        isvis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<Graph[curr].size();i++){
            Edge e=Graph[curr].get(i);

            if (stack[e.d]) {
                return true;
            }

            if (!isvis[e.d]&&iscycleutil(Graph, e.d, isvis, stack)) {
                return true;
            }
        }
        stack[curr]=true;
        return false;
    }
    public static void main(String args[]){
        ArrayList<Edge>[] graph = new ArrayList[7];
        createGraph(graph);

        System.out.println(iscycle(graph));
    }
}
