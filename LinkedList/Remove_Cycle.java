package LinkedList;

public class Remove_Cycle {
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
    public static boolean isCyclee(){
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
    public static void RemoveCycle(){
        //detect cycle
        node slow = head;
        node fast=head;
        boolean isCycle=false;
        while (fast!=null&&fast.Next!=null) {
            slow=slow.Next;
            fast=fast.Next.Next;
            if(fast==slow){
                isCycle=true;
                break;
            }
        }
            if(isCycle==false){
                return;
             }
        //find meeting point
        slow=head;
        node prev=null;
        while (slow!=fast) {
            prev=fast;
            slow=slow.Next;
            fast=fast.Next;
        }
        prev.Next=null;
    }
    public static void main(String args[]){
        head=new node(1);
        node temp=new node(2);
        head.Next=temp;
        head.Next.Next=new node(3);
        head.Next.Next.Next=temp;
        System.out.println(isCyclee());
       RemoveCycle();
       System.out.println(isCyclee());
     }
}
