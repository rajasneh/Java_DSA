package LinkedList;

public class Floyds_cycle {
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
    public static boolean Floyds(){
        node slow = head;
        node fast=head;
        while (fast!=null&&fast.Next!=null) {
            slow=slow.Next;
            fast=fast.Next.Next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        head=new node(1);
        head.Next=new node(2);
        head.Next.Next=new node(3);
        head.Next.Next.Next=head;
        System.out.print(Floyds());
     }
}
