package LinkedList;

public class Delete_N_th_Node {
    public static class node{
        int data;
        node Next;
        node(int data){
            this.data=data;
        }
    }
    public static node head;
    public static node tail;
    public static int size=0;
    public void addfirst(int data){
        //create new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.Next=head;
        head=newnode;
    }
    public void removenthNode(int n){//Deleting nth node from last element
        //calculate size
        node temp=head;
        int sz=0;
        while (temp!=null) {
            temp=temp.Next;
            sz++;
        }
        if (n < 0 || n >= sz) { // Corrected condition for invalid position
            System.out.println("Invalid position");
            return;
        }
        if (sz == 1 || n == sz - 1) { // Corrected condition for removing head or last node
            head = head.Next;
            size--;
            return;
        }
        if(sz==1){
            head=head.Next;
            return;
        }
        int iTofind=sz-n;
        int i=1;
        node prev=head;
        while (i<iTofind) {
            prev=prev.Next;
            i++;
        }
        prev.Next=prev.Next.Next;
        return;
    }
    public  void printlnll(){
        node x=head;
        while (x!=null) {
            System.out.print(x.data);
            x=x.Next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Delete_N_th_Node ll=new Delete_N_th_Node();
        ll.addfirst(0);
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.printlnll();
        //System.out.println("Size of LinkedList is "+ll.size);
        ll.removenthNode(1);
        ll.printlnll();
}
}

