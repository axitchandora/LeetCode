class Solution:
    def fractionAddition(self, expression: str) -> str:
        num = 0
        denom = 1
        def findgcd(a,b):
            if a == 0:
                return b
            return findgcd(b % a, a)
        
        nums = re.split(r"/|(?=[-+])",expression)
        nums = list(filter(None, nums))
        
        for i in range(0, len(nums),2):
            curr_num = int(nums[i])
            curr_denom = int(nums[i + 1])
            
            num = num * curr_denom + curr_num * denom
            denom = denom * curr_denom
        
        gcd = abs(findgcd(num, denom))
        
        num //= gcd
        denom //= gcd
        
        return str(num) + "/" + str(denom)
        
        