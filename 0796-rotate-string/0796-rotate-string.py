class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if len(s) != len(goal):
            return False
        
        dString = s + s
        return dString.find(goal) != -1
        