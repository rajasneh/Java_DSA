package LinkedList;

public class ZigZagLinkedList {
    public static class Node {
        int data;
        Node Next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addfirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.Next=head;
        head=newNode;
    }
        public void ZigZag(){
            //find mid
            Node slow =head;
            Node fast=head.Next;
            while (fast!=null&&fast.Next!=null) {
                slow=slow.Next;
                fast=fast.Next.Next;
            }
            Node mid=slow;
            Node curr=mid.Next;
            mid.Next=null;
            Node next;
            Node prev=null;
            while (curr!=null) {
                next=curr.Next;
                curr.Next=prev;
                prev=curr;
                curr=next;
            }
            Node left=head;
            Node right=prev;
            Node nextL,nextR;
            //merge
            while (left!=null && right!=null) {
                nextL=left.Next;
                left.Next=right;
                nextR=right.Next;
                right.Next=nextL;

                left=nextL;
                right=nextR;
            }

        }
        public static void printll(){
            Node x=head;
            while (x!=null) {
                System.out.print(x.data);
                x=x.Next;
            }
            System.out.println();
        }
        public static void main(String args[]){
            ZigZagLinkedList ll=new ZigZagLinkedList();
            ll.addfirst(5);
            ll.addfirst(4);
            ll.addfirst(3);
            ll.addfirst(2);
            ll.addfirst(1);
            ll.printll();
            ll.ZigZag();
            ll.printll();
        }
    }

