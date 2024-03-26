package LinkedList;

public class Iterative_Search {
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
    public  void printlnll(){
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
    public  int removeFirst(){
        int value;
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            value=head.data;
            head=tail=null;
            size--;
            return value;
        }
         value=head.data;
        head=head.Next;
        size--;
        return value;
    }
    public  int RemoveLast(){
        int value;
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.Next;
        }
        value=prev.Next.data;
        prev.Next=null;
        tail=prev;
        size--;
        return value;
    }
    public void IterativeSearch(int key){
        node temp=head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                System.out.println("Key found at index "+i);
                return;
            }
            temp=temp.Next;
            i++;
        }
        System.out.println("Key not found");
    }
    public static void main(String args[]){
        Iterative_Search ll=new Iterative_Search();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addfirst(4);
        ll.Add_in_middle(3,9);
        ll.printlnll();
        System.out.println("Size of LinkedList is "+size);
        ll.IterativeSearch(11);
        ll.IterativeSearch(1);
     }
}


