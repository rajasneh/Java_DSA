package LinkedList;

public class IntersectionOF_2_LL {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;

        }
    }
    public static node head;
    public static node tail;
    public static void addfirst(int data){
        //create new node
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public node findIntersection(node headA,node headB){
        while(headB!=null){
            node temp=headA;
            while (temp!=null) {
                if(temp==headB){
                    return headB;
                }
                temp=temp.next;
            }
            headB=headB.next;
        }
        return null;
    }
    public static void main(String[] args) {
        IntersectionOF_2_LL list = new IntersectionOF_2_LL();

        // Create nodes for linked lists
        node head1 = new node(10);
        node head2 = new node(5);

        // Add some nodes to the first linked list
        head1.next = new node(20);
        head1.next.next = new node(30);

        // Make the second linked list intersect with the first one at node with value 30
        head2.next = head1.next.next;

        // Find the intersection point
        node intersectionPoint = list.findIntersection(head1, head2);

        // Print the intersection point if it exists
        if (intersectionPoint == null) {
            System.out.println("No intersection point");
        } else {
            System.out.println("Intersection point: " + intersectionPoint.data);
        }
    }
}
