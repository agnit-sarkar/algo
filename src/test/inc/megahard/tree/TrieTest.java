package test.inc.megahard.tree;

import inc.megahard.tree.Trie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    Trie mTrie;

    @BeforeEach
    void setup() {
        mTrie = new Trie();
        mTrie.insert("cat");
        mTrie.insert("card");
        mTrie.insert("dart");
    }

    @Test
    void insert() {
        mTrie.printTrie();
    }

    @Test
    void search() {
        assertTrue(mTrie.search("cat"));
        assertFalse(mTrie.search("car"));
        assertFalse(mTrie.search("band"));
    }
}