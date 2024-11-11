class Solution:
    def primeSubOperation(self, nums: List[int]) -> bool:
        def is_prime(n):
            for f in range(2, int(sqrt(n))+1):
                if n % f == 0:
                    return False
            return True
        
        primes = [False, False] # primes[i] == True, if i == prime
        for i in range(2, max(nums)):
            if is_prime(i):
                primes.append(True)
            else:
                primes.append(False)
        
        prev = 0
        for n in nums:
            upper_bound = n - prev # non inclusive
            
            largest_p = 0
            for i in reversed(range(2, upper_bound)):
                if primes[i]:
                    largest_p = i
                    break
            
            if n - largest_p <= prev:
                return False
            prev = n - largest_p
            
        return True
            
            