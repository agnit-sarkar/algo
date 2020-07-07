package inc.megahard.Tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    Trie mTrie;

    @BeforeEach
    void setup() {
        mTrie = new Trie();
    }

    @Test
    void insert() {
        mTrie.insert("cat");
        mTrie.insert("card");
        mTrie.insert("dart");
        mTrie.printTrie();
    }
}