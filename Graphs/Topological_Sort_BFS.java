package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort_BFS {

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
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcIndegrees(ArrayList<Edge>[] graph, int[] indegrees) {
        for (int i = 0; i < graph.length; i++) {
            for (Edge edge : graph[i]) {
                indegrees[edge.d]++;
            }
        }
    }

    public static void topsort(ArrayList<Edge>[] graph) {
        int[] indegrees = new int[graph.length];
        calcIndegrees(graph, indegrees);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " ");

            for (Edge edge : graph[curr]) {
                indegrees[edge.d]--;
                if (indegrees[edge.d] == 0) {
                    queue.add(edge.d);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.print("Topological Sort: ");
        topsort(graph);
    }
}
