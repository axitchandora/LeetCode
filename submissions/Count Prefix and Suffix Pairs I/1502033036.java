# Title: Count Prefix and Suffix Pairs I
# Submission ID: 1502033036
# Status: Accepted
# Date: January 8, 2025 at 10:14:10 PM GMT+5:30

class TrieNode {
  Map<Integer, TrieNode> children = new HashMap<>();
  int count = 0;
}

class Trie {
  public int insert(final String word) {
    final int n = word.length();
    int count = 0;
    TrieNode node = root;
    for (int i = 0; i < n; ++i) {
      final char prefix = word.charAt(i);
      final char suffix = word.charAt(n - 1 - i);
      final int key = (prefix - 'a') * 26 + (suffix - 'a');
      node.children.putIfAbsent(key, new TrieNode());
      node = node.children.get(key);
      count += node.count;
    }
    ++node.count;
    return count;
  }

  private TrieNode root = new TrieNode();
}

class Solution {
  public int countPrefixSuffixPairs(String[] words) {
    int ans = 0;
    Trie trie = new Trie();

    for (final String word : words)
      ans += trie.insert(word);

    return ans;
  }
}