package LinkedList;

public class Skip_m_Delete_N_nodes {
    static class Node {
        int data;
        Node next;
    }

    // Method to push a new node onto the list
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    // Method to print the list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    // Method to skip M nodes and delete N nodes
    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head, t;
        int count;
        
        while (curr != null) {
            // Skip M nodes
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;

            if (curr == null) return;

            // 'curr' is now at the M-th node, 't' is the start of the N nodes to delete
            t = curr.next;

            // Delete N nodes
            for (count = 1; count <= N && t != null; count++) {
                t = t.next;
            }

            // Link M-th node to (N+1)-th node
            curr.next = t;

            // Move to the next segment
            curr = t;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        int M = 2, N = 3;

        // Construct the list 1->2->3->4->5->6->7->8->9->10
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

        System.out.printf("M = %d, N = %d \nLinked list we have is:\n", M, N);
        printList(head);

        skipMdeleteN(head, M, N);

        System.out.printf("\nLinked list after deletion:\n");
        printList(head);
    }
}

