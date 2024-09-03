class Solution:
    def getLucky(self, s: str, k: int) -> int:
        num_str = ""
        for st in s:
            num_str += str(ord(st)-ord('a')+1)
        
        while k:
            tmp_num = 0
            for i in range(len(num_str)):
                tmp_num += int(num_str[i])
            num_str = str(tmp_num)
            k-= 1
        return int(num_str)
        