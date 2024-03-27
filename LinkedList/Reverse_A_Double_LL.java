package LinkedList;
public class Reverse_A_Double_LL {
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
    public void print(){
        Node temp=Head;
        while (temp!=null) {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverseLL(){
        Node curr=Head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }

    public static void main(String args[]){
        Reverse_A_Double_LL DLL=new Reverse_A_Double_LL();
        DLL.AddFirst(10);
        DLL.AddFirst(9);
        DLL.AddFirst(8);
        DLL.AddFirst(7);
        DLL.AddFirst(6);
        DLL.AddFirst(5);
        DLL.AddFirst(4);
        DLL.print();
        DLL.reverseLL();
        DLL.print();
        System.out.print("Size of the Dobule LinkedList is "+size);
    }
}


