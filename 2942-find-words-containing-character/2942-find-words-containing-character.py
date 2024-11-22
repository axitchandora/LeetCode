class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        res = []
        for i,w in enumerate(words):
            for ch in w:
                if ch == x:
                    res.append(i)
                    break
        return res