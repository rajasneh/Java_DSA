package BinarySearch_Tree;

public class ClosestElementInBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Helper function to find the closest element recursively
    private static int findClosest(Node root, int target, int closest) {
        if (root == null) {
            return closest;
        }
        if (Math.abs(root.data - target) < Math.abs(closest - target)) {
            closest = root.data;
        }
        if (root.data < target) {
            return findClosest(root.right, target, closest);
        } else if (root.data > target) {
            return findClosest(root.left, target, closest);
        } else {
            return closest;
        }
    }

    // Function to find the closest element in the BST to the target value
    public static int closestElement(Node root, int target) {
        return findClosest(root, target, root.data);
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(9);
        root.left = new Node(4);
        root.right = new Node(17);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(22);
        
        int target = 12;
        int closest = closestElement(root, target);
        System.out.println("Closest element to " + target + " is: " + closest);
    }
}

