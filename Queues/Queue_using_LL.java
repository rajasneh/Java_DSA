package Queues;

public class Queue_using_LL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static node head=null;
        static node tail=null;

        public static boolean isEmpty(){
           return head==null && tail==null;
        }


        //add 

        public static void add(int data){
            node NewNode=new node(data);
            if(head==null){
                head=tail=NewNode;
                return;
            }
            tail.next=NewNode;
            tail=NewNode;
        }

        //remove

        public static int remove(){
            if (isEmpty()) {
                System.out.print("Empty Queue");
             }
             int front=head.data;
                if(head==tail){
                    head=tail=null;
                }else{
                    head=head.next;
            }
            return front;
        }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Empty queue");
                    return -1;
                }
                return head.data;
            }
    }
    public static void main(String args[]){
        Queue q =new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

