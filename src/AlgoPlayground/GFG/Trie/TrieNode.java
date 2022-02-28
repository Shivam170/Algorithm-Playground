package AlgoPlayground.GFG.Trie;

public class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean isEnd;
}

class Operation {
    TrieNode root;

    void insert(String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null) {
                curr.child[index] = new TrieNode();
            }
            curr = curr.child[index];
        }
        curr.isEnd = true;
    }

    boolean search(String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null) {
                return false;
            }
            curr = curr.child[index];
        }
        return curr.isEnd;
    }
}