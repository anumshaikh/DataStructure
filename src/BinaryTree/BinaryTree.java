package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }

    }

    public void postorder(Node root) {
        if (root != null) {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            inorder(root.left);
            inorder(root.right);
        }

    }

    // level order traversal and then inserting node at the end
    public void insert(int key, Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        if (root == null) {
            this.root = new Node(key);
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.peek();
            queue.remove();

            if (root.left == null) {
                root.left = new Node(key);
                break;
            } else
                queue.add(root.left);
            if (root.right == null) {
                root.right = new Node(key);
                break;
            } else
                queue.add(root.right);
        }

    }

    static void deleteDeepest(Node root, Node delNode) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        Node temp = null;

        // Do level order traversal until last node
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delNode) {
                temp = null;
                return;

            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else
                    q.add(temp.right);
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else
                    q.add(temp.left);
            }
        }
    }

    // level order traversal and then inserting node at the end
    public int delete(int key, Node root) {

        Queue<Node> queue = new LinkedList<Node>();

        Node delNode = null, temp = null;

        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            if (root.key == key) {
                this.root = null;
                return key;
            } else
                return -1;
        }
        queue.add(root);
        while (!queue.isEmpty()) {

            temp = queue.peek();
            queue.remove();
            System.out.println("current Element " + temp.key);

            if (temp.key == key) {
                delNode = temp;  // delnode is element to be deleted
                                 // temp is right most node to be replaced
            }

            if (temp.left != null)
                queue.add(temp.left);

            if (temp.right != null)
                queue.add(temp.right);
        }

        if (delNode != null) {
            int x = temp.key;
            deleteDeepest(root,temp);
            delNode.key = x;
          /*   System.err.println("Last key traversed " + x);
            temp = null;
            String s = (temp == null) ? "root is null " + temp : "root is not null";
            System.out.println(s); */
            return x;
        } else
            return -1;

    }
    
    boolean checkBST(Node root) {
        if (root == null)
            return true;
        Node temp = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            Node left = temp.left;
            Node right = temp.right;
            if (left != null) {
                if (temp.key <= left.key) {
                    return false;
                }
                queue.add(left);

            }
            if (right != null) {
                if (temp.key >= right.key) {
                    return false;
                }
                queue.add(right);

            }
        }
        return true;

    }

    public static void main(String args[]) {
       /*  BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.right = new Node(3);
        bt.root.left = new Node(2);
        bt.root.left.left = new Node(4);
        bt.inorder(bt.root);
        bt.insert(5, bt.root);
        bt.insert(6, bt.root);
        bt.insert(7, bt.root);
        System.out.println("\n After inserting 5 6 7");
        bt.inorder(bt.root);
        bt.insert(8, bt.root);
        bt.insert(9, bt.root);
        bt.insert(10, bt.root);
        System.out.println("\n After inserting 8 9 10");
        bt.inorder(bt.root);
        bt.delete(2, bt.root);
        System.out.println("\n Afte Deleting  2");
        bt.inorder(bt.root); */
        BinaryTree bst = new BinaryTree();
       
       int arr[] = {  1, 2 ,3 ,5 ,4 ,6, 7 };
       for (int i = 0; i < arr.length; i++)
           bst.insert(arr[i],bst.root);
       System.out.println(bst.checkBST(bst.root));
    }
}
