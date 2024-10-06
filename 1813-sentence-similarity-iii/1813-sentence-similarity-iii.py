class Solution:
    def areSentencesSimilar(self, sentence1: str, sentence2: str) -> bool:
        s1 = sentence1.split(" ")
        s2 = sentence2.split(" ")
        
        if len(s2) < len(s1):
            s1, s2 = s2, s1
            
        # s1 should be prefix, suffix or combination of both
        l1 = 0
        while l1 < len(s1) and s1[l1] == s2[l1]:
            l1 = l1 + 1 
            
        r1, r2 = len(s1) - 1, len(s2) - 1
        while r1 >= l1 and r2 >= 0 and s1[r1] == s2[r2]:
            r1, r2 = r1 - 1, r2 - 1
            
        return l1 > r1