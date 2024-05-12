package Graphs;

import java.util.ArrayList;

public class AdjacencyList_Graph {
    static class Edge{
        int src;//source
        int des;//destination
        int wt;//weight

        public Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }
    public static void main(String args[]){
        /*
                (5)
            0-------1
                   / \
             (1)  /   \  (3)
                 /     \
                /       \ 
               2 ------- 3
               |   (1)
               |
          (2)  |
               |
              (4)

         */
        
        int v=5;//vertex
        ArrayList<Edge>Graph[]=new ArrayList[v];
        
        for(int i=0;i<v;i++){
            Graph[i]=new ArrayList<>(); //make seperate arraylist at each index of array graph
        }

        //0-vertex
        Graph[0].add(new Edge(0, 1, 5));

        //1-vertex
        Graph[1].add(new Edge(1, 0, 5));
        Graph[1].add(new Edge(1, 2, 1));
        Graph[1].add(new Edge(1, 3, 3));

        //2-vertex

        Graph[2].add(new Edge(2, 1, 1));
        Graph[2].add(new Edge(2, 3, 1));
        Graph[2].add(new Edge(2, 4, 2));

        //3-vertex

        Graph[3].add(new Edge(3, 1, 3));
        Graph[3].add(new Edge(3, 2, 1));

        //4-vertex
        Graph[4].add(new Edge(4, 2, 2));

        //2-neighbour 
        for(int i=0;i<Graph[2].size();i++){
            Edge e=Graph[2].get(i);
            System.out.println(e.des);
        }
    }
}