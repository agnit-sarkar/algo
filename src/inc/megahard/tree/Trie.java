package inc.megahard.tree;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    Node root = new Node();

    class Node {
        boolean isWord;
        Map<Character, Node> children= new HashMap<>();
    }

    public void insert(String word) {
        Node current = root;
        for (char letter: word.toCharArray()) {
            Node next = current.children.get(letter);
            if (next == null) {
                next = new Node();
                current.children.put(letter, next);
            }
            current = next;
        }
        current.isWord = true;
    }

    public void printTrie() {
        printNode(root, "");
    }

    public boolean search(String word) {
        Node current = root;
        for (char letter: word.toCharArray()) {
            Node next = current.children.get(letter);
            if (next == null) {
                return false;
            }
            current = next;
        }
        if (current.isWord)
            return true;
        return false;
    }

    public void printNode(Node root, String word) {
        if (root.children.isEmpty()) {
            System.out.println(word);
            return;
        }
        for (Character letter : root.children.keySet()) {
            word += letter;
            printNode(root.children.get(letter), word);
            word = word.substring(0, word.length() -1);
        }
    }
}
