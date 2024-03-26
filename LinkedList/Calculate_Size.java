package LinkedList;

public class Calculate_Size {
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
    public void addlast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }
        tail.Next=newnode;
        tail=newnode;
    }
    public  void printll(){
        node x=head;
        while (x!=null) {
            System.out.print(x.data);
            x=x.Next;
        }
        System.out.println();
    }
    public void Add_in_middle(int idx,int data){
        if(idx==0){//if we have to add at 0 means add in head
            addfirst(data);
            return;
        }
        int i=0;
        node newnode=new node(data);
        size++;
        node temp=head;
        while (i<idx-1) {
            temp=temp.Next;
            i++;
        }
        newnode.Next=temp.Next;
        temp.Next=newnode;
    }
    public static void main(String args[]){
        Calculate_Size ll=new Calculate_Size();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addfirst(4);
        ll.Add_in_middle(3,9);
        ll.printll();
        System.out.print("Size of LinkedList is "+size);
     }
}
