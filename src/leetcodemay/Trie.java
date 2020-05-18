package leetcodemay;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private TrieNode[] trieNodes;
    /** Initialize your data structure here. */
    public Trie() {
        trieNodes = new TrieNode[27];
        for (int i = 96; i < 123; i++) {
            trieNodes[i%96] = new TrieNode((char) (i));
        }
    }


    /** Inserts a word into the trie. */
    public void insert(String word) {
        word = word+'`';
        char[] letters = word.toCharArray();
        TrieNode currentNode = trieNodes[letters[0]%96];
        for (int i = 1; i < letters.length; i++) {

            if(currentNode.links == null){
                currentNode.links = new TrieNode[123];
            }
            TrieNode linkNode =
                    currentNode.links[letters[i]%96]!=null?
                            currentNode.links[letters[i] % 96]:
                            new TrieNode(letters[i]);
            currentNode.links[letters[i]%96]= linkNode;
            currentNode = linkNode;
        }
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        word = word +'`';
        char[] letters = word.toCharArray();
        TrieNode currentNode = trieNodes[letters[0]%96];
        for (int i = 1; i < letters.length; i++) {
            if (currentNode.links == null ||
                    currentNode.links[letters[i]%96]==null){
                return false;
            }
            currentNode = currentNode.links[letters[i]%96];
        }
        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] letters = prefix.toCharArray();
        TrieNode currentNode = trieNodes[letters[0]%96];
        if (currentNode.links == null){
            return false;
        }
        for (int i = 1; i < letters.length; i++) {
            if (currentNode.links[letters[i]%96]==null){
                return false;
            }
            currentNode = currentNode.links[letters[i]%96];

        }
        return true;
    }

    private class TrieNode {
        char data;
        TrieNode[] links;

        public TrieNode(char c) {
            data = c;;
        }

    }
}
