package inc.megahard.Tree;

public abstract class Tree<T> {
    public class Node {
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
