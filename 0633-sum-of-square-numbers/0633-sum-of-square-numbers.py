class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        squareroot = set()
        
        for i in range(int(sqrt(c))+1):
            squareroot.add(i * i)
            
        a = 0
        while a * a <= c:
            target = c - a * a
            if target in squareroot:
                return True
            a += 1
        return False