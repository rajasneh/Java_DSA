package Heaps;
import java.util.*;
public class PQ_For_Objects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student>pq= new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 12));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 1));
        pq.add(new Student("E", 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
