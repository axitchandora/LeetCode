class TrieNode:
    def __init__(self):
        self.children = {}
        self.isWord = False       

class Trie:

    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        t = self.root
        for w in word:
            if w not in t.children:
                t.children[w] = TrieNode()
            t = t.children[w]
        t.isWord = True

    def search(self, word: str) -> bool:
        t = self.root
        for w in word:
            if w not in t.children:
                return False
            t = t.children[w]
        return t.isWord

    def startsWith(self, prefix: str) -> bool:
        t = self.root
        for p in prefix:
            if p not in t.children:
                return False
            t = t.children[p]
        return True


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)