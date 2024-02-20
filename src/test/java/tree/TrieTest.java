package tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    private Trie underTest;

    @BeforeEach
    void setUp() {
        underTest = new Trie();
    }

    @Test
    void insert() {
        underTest.insert("hok");

        Assertions.assertEquals(true, underTest.search("hok"));
    }

    @Test
    void search() {
        underTest.insert("hok");

        Assertions.assertEquals(true, underTest.search("hok"));
        Assertions.assertEquals(false, underTest.search("hok2"));
    }

    @Test
    void startsWith() {
        underTest.insert("hok");

        Assertions.assertEquals(true, underTest.startsWith("h"));
        Assertions.assertEquals(true, underTest.startsWith("ho"));
        Assertions.assertEquals(false, underTest.startsWith("a"));
    }
}