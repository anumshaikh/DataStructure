package BinarySearchTree;

public class BST {
    Node root;

    class Node {
        int key;
        Node left, right;

        Node() {
            left = right = null;
        }

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    BST() {
        root = null;
    }

    BST(int key) {
        root = new Node(key);
    }

    Node insertRec(int key, Node root) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(key, root.left);
        } else if (key > root.key) {
            root.right = insertRec(key, root.right);
        }
        return root;
    }

    void insert(int key) {
        root = insertRec(key, root);
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    void delete(int key) {
        root = deleteRec(key, root);
    }

    Node deleteRec(int key, Node root) {
        if (root == null) {
            return null;
        }
        if (key < root.key) {
            root.left = deleteRec(key, root.left);
        } else if (key > root.key) {
            root.right = deleteRec(key, root.right);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
          
                root.key = minval(root.right);
               root.right= deleteRec(root.key, root.right);
           
        }
        return root;

    }

    int minval(Node root) {
        int key=root.key;
        if (root != null) {
            while (root.left != null) {
                key = root.left.key;
                root = root.left;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(6);
        bst.insert(25);
        bst.insert(2);
        bst.inorder(bst.root);
        bst.delete(10);
        System.err.println("After dlete");
        bst.inorder(bst.root);

    }

}
