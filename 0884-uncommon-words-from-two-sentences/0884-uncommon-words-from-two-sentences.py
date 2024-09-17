class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]: 
        return [w for w,cnt in Counter(s1.split(" ") + s2.split(" ")) .items() if cnt == 1 ]