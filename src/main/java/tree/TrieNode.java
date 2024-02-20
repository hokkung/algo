package tree;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class TrieNode {
    public Map<String, TrieNode> child;
    public boolean isEnd;

    public TrieNode() {
        this.child = new HashMap<>();
        this.isEnd = false;
    }
}
