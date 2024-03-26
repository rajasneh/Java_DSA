package LinkedList;

public class Palindrome {
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
    public node FindMidNode(){
        node slow=head;
        node fast=head;
        while (fast.Next!=null&&fast!=null) {
            slow =head.Next;
            fast=head.Next.Next;
        }
        return slow;
    }   
    public boolean checkPalindrome(){
        if(head.Next==null||head==null){
            return true;
        }
        //step 1find mid
        node mid = FindMidNode();
        //step 2 reverse second half
        node prev=null;
        node curr=mid;
        node next;
        while (curr!=null) {
            next=curr.Next;
            curr.Next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left=head;
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left=left.Next;
            right=right.Next;
        }
        return true;
        
    }
    public static void main(String args[]){
        Palindrome ll=new Palindrome();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(2);
        System.out.print(ll.checkPalindrome());
     }
}
