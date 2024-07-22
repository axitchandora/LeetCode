class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        s_freq = defaultdict(int)
        for i in s:
            s_freq[i] += 1
        for i in t:
            if i not in s_freq or s_freq[i]==0:
                return False
            else:
                s_freq[i]-= 1
        return True
                
        