package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_Graph {
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
    public static boolean isBipartite(ArrayList<Edge>Graph[]){
        int col[]=new int[Graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }
        Queue<Integer>q=new LinkedList<>();
        
        for(int i=0;i<Graph.length;i++){
            if (col[i]==-1) {
                q.add(i);
                col[i]=0;

                while (!q.isEmpty()) {
                    int curr=q.remove();
                   for(int j=0;j<Graph[curr].size();j++){
                        Edge e=Graph[curr].get(j);
                        if (col[e.d]==-1) {
                            int nextcol=col[curr]==0?1:0;
                            col[e.d]=nextcol;
                            q.add(e.d);
                        }else if (col[e.d]==col[curr]) {
                            return false;
                        }
                   }
                }
            }
        }
        return true;
    }   
    public static void main(String args[]){
         /* 

               1--------3
              /         |\    
             /          |  \
            0           |   5-----6
             \          |   /
               \        | /
                 2------4/
        */
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];
        createGraph(graph);
         System.out.println(isBipartite(graph));     
    } 
}
