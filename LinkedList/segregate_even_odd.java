package LinkedList;

/* Odd Even Linked List

We have a Linked List of integers, write a function to modify the linked list such that all even
numbers appear before all the odd numbers in the modified linked list. Also, keep the order of
even and odd numbers same.

Sample Input 1 : 8->12->10->5->4->1->6->NULL
Sample Output 1 : 8->12->10->4->6->5->1->NULL
Sample Input 2 : 1->3->5->7->NULL
Sample Output 2 : 1->3->5->7->NULL */

public class segregate_even_odd {
        class Node {
            int data;
            Node next;
    
            Node(int d) {
                data = d;
                next = null;
            }
        }
        public static Node head;
        void segregateEvenOdd() {
            if (head == null || head.next == null) {
                return; // No need to segregate if list is empty or has only one node
            }
    
            Node end = head;
            Node prev = null;
            Node curr = head;
    
            // Move 'end' pointer to the last node
            while (end.next != null) {
                end = end.next;
            }
    
            Node new_end = end;
    
            while (curr.data % 2 != 0 && curr != end) {
                new_end.next = curr;
                curr = curr.next;
                new_end.next.next = null;
                new_end = new_end.next;
            }
    
            // If first node is even, then move 'head' pointer
            if (curr.data % 2 == 0) {
                head = curr;
    
                // Iterate till 'curr' reaches 'end'
                while (curr != end) {
                    // If current node is even, move to next node
                    if (curr.data % 2 == 0) {
                        prev = curr;
                        curr = curr.next;
                    } else {
                        // If current node is odd, remove it from the list
                        prev.next = curr.next;
                        curr.next = null;
                        new_end.next = curr;
                        new_end = curr;
                        curr = prev.next;
                    }
                }
            } else {
                prev = curr;
            }
    
            // If 'new_end' is not 'end' and last node is odd, then move 'prev' pointer
            if (new_end != end && end.data % 2 != 0) {
                prev.next = end.next;
                end.next = null;
                new_end.next = end;
            }
        }
    
        void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
    
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    
        public static void main(String args[]) {
            segregate_even_odd llist = new segregate_even_odd();
            llist.push(8);
            llist.push(12);
            llist.push(10);
            llist.push(5);
            llist.push(4);
            llist.push(6);
            llist.push(1);
            System.out.println("Linked List");
            llist.printList();
            llist.segregateEvenOdd();
            System.out.println("After segregation:");
            llist.printList();
        }
    }
    
