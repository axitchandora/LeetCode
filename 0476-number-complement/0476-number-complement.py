class Solution:
    def findComplement(self, num: int) -> int:
        tmp = num
        noofallbitshigh = 0
        while tmp:
            tmp = tmp >> 1
            noofallbitshigh += 1
        allbitshigh = 2 ** noofallbitshigh - 1
        return allbitshigh ^ num
        
        