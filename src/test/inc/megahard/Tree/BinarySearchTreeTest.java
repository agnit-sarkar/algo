package test.inc.megahard.Tree;

import inc.megahard.Tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
    BinarySearchTree tree =  new BinarySearchTree();

    @BeforeEach
    void setup() {
        tree.insert(6);
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(9);
        tree.insert(7);
        tree.insert(10);
    }

    @Test
    void insert() {
        tree.printTree();
    }

    @Test
    void remove() {
    }

    @Test
    void traverseInOrder() {
        tree.traverseInOrder();
    }

    @Test
    void traversePreOrder() {
        tree.traversePreOrder();
    }

    @Test
    void traversePostOrder() {
        tree.traversePostOrder();
    }
}