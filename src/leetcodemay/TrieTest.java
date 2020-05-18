package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class TrieTest {
    @Test
    public void testIfAppleCanBeInsertedIntoTest(){
        Trie trie = new Trie();
        Assert.assertFalse(trie.startsWith("a"));
        Assert.assertFalse(trie.search("a"));
        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));
        Assert.assertFalse(trie.search("app"));
        trie.insert("apps");
        Assert.assertTrue(trie.startsWith("app"));
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));
    }

    @Test
    public void testIfDuplicateLettersCauseIssue(){
        Trie trie = new Trie();
        trie.insert("add");
        Assert.assertFalse(trie.search("ad"));

    }

    @Test
    public void testVariousCombinations(){
        Trie trie = new Trie();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        Assert.assertFalse(trie.search("apps"));
        Assert.assertTrue(trie.search("app"));
        Assert.assertFalse(trie.search("ad"));
        Assert.assertFalse(trie.search("applepie"));
        Assert.assertFalse(trie.search("rest"));
        Assert.assertFalse(trie.search("jan"));;
        Assert.assertFalse(trie.search("rent"));;
        Assert.assertTrue(trie.search("beer"));;
        Assert.assertTrue(trie.search("jam"));;
        Assert.assertFalse(trie.startsWith("apps"));;
        Assert.assertTrue(trie.startsWith("app"));;
        Assert.assertTrue(trie.startsWith("ad"));;
        Assert.assertFalse(trie.startsWith("applepie"));;
        Assert.assertFalse(trie.startsWith("rest"));;
        Assert.assertFalse(trie.startsWith("jan"));;
        Assert.assertTrue(trie.startsWith("rent"));;
        Assert.assertTrue(trie.startsWith("beer"));;
        Assert.assertTrue(trie.startsWith("jam"));;



    }


}
