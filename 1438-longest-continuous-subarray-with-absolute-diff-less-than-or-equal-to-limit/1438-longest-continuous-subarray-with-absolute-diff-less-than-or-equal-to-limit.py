class Solution:
    def longestSubarray(self, nums: List[int], limit: int) -> int:
        biggest = collections.deque()
        smallest = collections.deque()
        N = len(nums)
        
        left = right = 0
        best = 0
        
        while right < N :
            v = nums[right]
            
            while len(biggest) > 0 and biggest[-1] < v: 
                biggest.pop()
            biggest.append(v)
                
            while len(smallest) > 0 and smallest[-1] > v:
                smallest.pop()
            smallest.append(v)
            
            while biggest[0] - smallest[0] > limit:
                if biggest[0] == nums[left]:
                    biggest.popleft()
                if smallest[0] == nums[left]:
                    smallest.popleft()
                left +=1
                
            best = max(best, right - left + 1)
            right +=1            
        return best
        