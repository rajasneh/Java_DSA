package LinkedList;
/* Swapping Nodes in a Linked List


We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
swapped by changing links. Swapping data of nodes may be expensive in many situations when
data contains many fields. It may be assumed that all keys in the linked list are distinct.

Sample Input 1 : 1->2->3->4, x = 2, y = 4
Sample Output 1 : 1->4->3->2 */
public class Swap_X_and_Y_in_LL {
    static class node {
        int data;
        node next;
    }
    public static node head;
    public static node tail;
    static node push(node head_ref, int new_data) {
        node new_node = new node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static void printList(node head) {
        node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }
    public static void  SwapKeys(int x , int y){
        if(x==y){
            return;
        }
        node prevX=null,currX=head;
       while (currX!=null&&currX.data!=x) {
            prevX=currX;
            currX=currX.next;
       }
       node prevY=null,currY=head;
       while (currY!=null&&currY.data!=y) {
        prevY=currY;
        currY=currY.next;
       }
       if(prevX!=null){
        prevX.next=currY;
       }
       else{
        head=currY;
       }
       if (currY!=null) {
        prevY.next=currX;
       }
       else{
        head=currX;
       }
            if(currX!=null&&currY!=null){
            node temp = currX.next;
            currX.next = currY.next;
            currY.next = temp;
            }

}
public static void main(String args[]) {
    head = push(head, 10);
    head = push(head, 9);
    head = push(head, 8);
    head = push(head, 7);
    head = push(head, 6);
    head = push(head, 5);
    head = push(head, 4);
    head = push(head, 3);
    head = push(head, 2);
    head = push(head, 1);
    printList(head);
    SwapKeys(2,8);
    printList(head);
}
}


