package Binary_Tree;

public class Build_Tree_Preorder {
    // Node class for the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class containing static methods for building and printing the tree
    static class BinaryTree {
        // Method to build tree from preorder traversal array
        public static Node buildTree(int[] nodes, int[] index) {
            if (index[0] >= nodes.length || nodes[index[0]] == -1) {
                index[0]++;
                return null;
            }

            Node newNode = new Node(nodes[index[0]++]);
            newNode.left = buildTree(nodes, index);
            newNode.right = buildTree(nodes, index);

            return newNode;
        }

        // Static method to print the tree in-order for verification
        public static void printInOrder(Node root) {
            if (root != null) {
                printInOrder(root.left);
                System.out.print(root.data + " ");
                printInOrder(root.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] index = {0}; // Using an array to hold the index to be mutable

        Node root = BinaryTree.buildTree(nodes, index);

        // Print tree in-order to verify
        System.out.println("In-order traversal of the tree:");
        BinaryTree.printInOrder(root);
    }
}

