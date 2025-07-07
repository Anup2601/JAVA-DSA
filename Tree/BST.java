// BST.java
public class BST {

    // Node class for BST
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Root node
    Node root;

    // Constructor
    public BST() {
        root = null;
    }

    // Insert a new value into BST
    Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // In-order traversal (Left, Root, Right)
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Pre-order traversal (Root, Left, Right)
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Post-order traversal (Left, Right, Root)
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Search a value in BST
    boolean search(Node node, int value) {
        if (node == null) return false;
        if (value == node.data) return true;
        else if (value < node.data) return search(node.left, value);
        else return search(node.right, value);
    }

    // Find the minimum value node in a subtree
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a node from BST
    Node delete(Node root, int value) {
        if (root == null) return root;

        if (value < root.data)
            root.left = delete(root.left, value);
        else if (value > root.data)
            root.right = delete(root.right, value);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor
            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    // Main method to test BST
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.println("In-order Traversal:");
        tree.inorder(tree.root); // 20 30 40 50 60 70 80

        System.out.println("\nPre-order Traversal:");
        tree.preorder(tree.root); // 50 30 20 40 70 60 80

        System.out.println("\nPost-order Traversal:");
        tree.postorder(tree.root); // 20 40 30 60 80 70 50

        System.out.println("\nSearch 60: " + (tree.search(tree.root, 60) ? "Found" : "Not Found"));

        System.out.println("Deleting 70...");
        tree.root = tree.delete(tree.root, 70);
        System.out.println("In-order After Deletion:");
        tree.inorder(tree.root); // 20 30 40 50 60 80
    }
}
