class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        words = sentence.split(" ")
        for i, w in enumerate(words):
            if w[:len(searchWord)] == searchWord:
                return i+1
        return -1