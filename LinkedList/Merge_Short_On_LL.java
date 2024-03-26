package LinkedList;

public class Merge_Short_On_LL {
    public Node getmid(Node Head){
        Node fast=Head.Next;//we have consider the last node of first half as mid 
        Node slow=Head;
        while (fast!=null&&fast.Next!=null) {
            slow=slow.Next;
            fast=fast.Next.Next;
        }
        return slow;
    }
    public Node Merged(Node head1,Node head2){
        Node MergedLL=new Node(-1);
        Node temp=MergedLL;
        while (head1!=null&&head2!=null) {
            if(head1.data>=head2.data){
                temp.Next=head2;
                head2=head2.Next;
                temp=temp.Next;
            }
            else{
                temp.Next=head1;
                head1=head1.Next;
                temp=temp.Next;
            }
            
        }
        while (head2!=null) {
            temp.Next=head2;
            head2=head2.Next;
            temp=temp.Next;
        }
        while(head1!=null){
            temp.Next=head1;
            head1=head1.Next;
            temp=temp.Next;
        }
       
        return MergedLL.Next;//Next because we have to delete the dummy node i.e -1
    }
    public Node MergeSort(Node Head){
        if(Head==null||Head.Next==null){
            return Head;
        }
        Node mid = getmid(Head);
        Node newLeft = Head; // head of left half
        Node newRight = mid.Next; // head of right half
        mid.Next = null; // breaking the link to split into two halves
        newLeft = MergeSort(newLeft); // recursion on left half
        newRight = MergeSort(newRight); // recursion on right half
        return Merged(newLeft, newRight); // Merge sorted halves
    }

    
    public static void printll(){
        Node x=head;
        while (x!=null) {
            System.out.print(x.data);
            x=x.Next;
        }
        System.out.println();
    }
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
    public static void main(String args[]){
       // Merge_Short_On_LL ll =new Merge_Short_On_LL();
        // ll.addfirst(1);
        // ll.addfirst(2);
        // ll.addfirst(3);
        // ll.addfirst(4);
        // ll.addfirst(5);
        printll();
        
        // ll.head = ll.MergeSort(ll.head);
       
        printll();;
     }
}

