package tree;

public class Trie {
    private TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = this.root;
        for (int i = 0; i < word.length(); i++) {
            String w = word.substring(i,i+1);
            TrieNode node = cur.child.getOrDefault(w, null);
            if (node == null) {
                node = new TrieNode();
                cur.child.put(w, node);
            }
            cur = node;
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode cur = this.root;
        for (int i = 0; i < word.length(); i++) {
            String w = word.substring(i,i+1);
            TrieNode node = cur.child.getOrDefault(w, null);
            if (node == null) {
                return false;
            }
            cur = node;
        }
        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            String p = prefix.substring(i,i+1);
            TrieNode node = cur.child.getOrDefault(p, null);
            if (node == null) {
                return false;
            }
            cur = node;
        }
        return true;
    }
}
