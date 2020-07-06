package inc.megahard.Tree;

public class BinarySearchTree extends Tree<Integer> {

    @Override
    protected Node insert(Node root, Integer data) {
        if (root == null) {
            return new Node(data);
        }

        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
}
