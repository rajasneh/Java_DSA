package LinkedList;

public class ZigZagLinkedList {
    public static class Node {
        int data;
        Node next;  // Fixed from 'Next' to 'next'
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public  void addFirst(int data){
        // Create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void zigZag(){
        if (head == null || head.next == null) {
            return; // List is empty or has only one node
        }

        // Find the middle of the list
        Node slow = head;
        Node fast = head.next; // Start fast at head.next
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node curr = mid.next;
        mid.next = null; // Split the list into two halves

        // Reverse the second half
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Merge the two halves
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

        // Attach the remaining nodes if the right half is longer
        if (left != null) {
            left.next = null;
        }
    }

    public static void printList(){
        Node x = head;
        while (x != null) {
            System.out.print(x.data + " ");
            x = x.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Original list:");
        printList();
        ll.zigZag();
        System.out.println("Zigzag list:");
        printList();
    }
}

