// BinaryTree.java
public class Binarytree {

    // Node class representing each node in the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Root of the Binary Tree
    Node root;

    // Constructor
    Binarytree() {
        root = null;
    }

    // In-order traversal: Left -> Root -> Right
    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Pre-order traversal: Root -> Left -> Right
    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Post-order traversal: Left -> Right -> Root
    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Example usage
    public static void main(String[] args) {
        Binarytree tree = new Binarytree();

        // Manually constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order traversal:");
        tree.inorder(tree.root);  // Output: 4 2 5 1 3

        System.out.println("\nPre-order traversal:");
        tree.preorder(tree.root); // Output: 1 2 4 5 3

        System.out.println("\nPost-order traversal:");
        tree.postorder(tree.root); // Output: 4 5 2 3 1
    }
}
