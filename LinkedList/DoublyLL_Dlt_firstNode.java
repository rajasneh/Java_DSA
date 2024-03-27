package LinkedList;

public class DoublyLL_Dlt_firstNode {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void AddFirst(int data){
        Node newnode=new Node(data);
        size ++;
        if(Head==null){
            Head=Tail=newnode;
            return;
        }
        newnode.next=Head;
        Head.prev=newnode;
        Head=newnode;
    }
    public static Node Head;
    public static Node Tail;
    public static int size;
    public int DeleteFirst(){
        if(Head==null){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=Head.data;
            Head=Tail=null;
            size--;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        Head.prev=null;
        size--;
        return val;
    }
    public void print(){
        Node temp=Head;
        while (temp!=null) {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        DoublyLL_Dlt_firstNode DLL=new DoublyLL_Dlt_firstNode();
        DLL.AddFirst(10);
        DLL.AddFirst(9);
        DLL.AddFirst(8);
        DLL.AddFirst(7);
        DLL.AddFirst(6);
        DLL.AddFirst(5);
        DLL.AddFirst(4);
        DLL.print();
        DLL.DeleteFirst();
        DLL.print();
        System.out.print("Size of the Dobule LinkedList is "+size);
    }
}
