package inc.megahard.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public abstract class BinaryTree<T> {
    class Node {
        public Node left;
        public Node right;
        public T data;

        public Node(T data) {
            this.data = data;
        }
    }
    protected Node root;

    public void insert(T data) {
        root = insert(root, data);
    }

    protected abstract Node insert(Node root, T data);

    public void remove(T data) {

    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traverseInOrder(root.left);
        System.out.print(root.data + " ");
        traverseInOrder(root.right);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data);
        System.out.print(" ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void traverseLevelOrder() {
        if (root == null)
            return;
        LinkedList<Node> nodeQueue =  new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.pollFirst();
            System.out.print(node.data + " ");

            if (node.left != null) {
                nodeQueue.offer(node.left);
            }

            if (node.right != null) {
                nodeQueue.offer(node.right);
            }
        }
    }

    public void printTree() {
        printNode(0, root);
    }

    public void printNode(int level, Node root) {
        if (root == null) {
            return;
        }
        printNode(++level, root.right);
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(root.data);

        printNode(level, root.left);
    }
}
