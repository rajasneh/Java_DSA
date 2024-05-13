package Graphs;

import java.util.*;

public class Breadth_First_Search {
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

    public static void bfs(ArrayList<Edge>[]Graph){
        Queue<Integer>q=new LinkedList<>();
        boolean isVisited[]=new boolean[Graph.length];

        q.add(0);

        while (!q.isEmpty()) {
            int curr=q.remove();
            if (!isVisited[curr]) {
                System.out.print(curr+" ");
                isVisited[curr]=true;
                for(int i=0;i<Graph[curr].size();i++){
                    Edge e=Graph[curr].get(i);
                    q.add(e.d);
                }
            }
        }
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
        ArrayList<Edge>[] graph = new ArrayList[7];
        createGraph(graph);
        bfs(graph);
    }
}

