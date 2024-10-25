class Trie:
    def __init__(self):
        self.children = {} # string -> Trie
        self.end_of_folder = False
        
    def add(self, path):
        cur = self
        for f in path.split("/"):
            if f not in cur.children:
                cur.children[f] = Trie()
            cur = cur.children[f]
        cur.end_of_folder = True
        
    def prefix_search(self, path):
        cur = self
        folders = path.split("/")
        for i in range(len(folders) - 1):
            cur = cur.children[folders[i]]
            if cur.end_of_folder:
                return True
        return False

class Solution:
    def removeSubfolders(self, folder: List[str]) -> List[str]:
        trie = Trie()
        
        for f in folder:
            trie.add(f)
            
        res = []
        for f in folder:
            if not trie.prefix_search(f):
                res.append(f)
        return res