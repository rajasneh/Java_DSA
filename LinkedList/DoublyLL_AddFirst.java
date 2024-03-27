package LinkedList;
public class DoublyLL_AddFirst {
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
    public static Node Head;
    public static Node Tail;
    public static int size;
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
    public void print(){
        Node temp=Head;
        while (temp!=null) {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        DoublyLL_AddFirst DLL=new DoublyLL_AddFirst();
        DLL.AddFirst(3);
        DLL.AddFirst(2);
        DLL.AddFirst(1);
        DLL.print();
        System.out.print("Size of the Dobule LinkedList is "+size);
    }
}
