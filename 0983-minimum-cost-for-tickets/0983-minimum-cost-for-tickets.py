class Solution:
    def mincostTickets(self, days: List[int], costs: List[int]) -> int:
        # Top to Bottom DP
        dp = {}
        
        for i in range(len(days)-1 , -1 , -1):           
            dp[i] = float("inf")
            
            for d,c in zip([1,7,30],costs):
                j = i
                while j < len(days) and days[j] < days[i] + d:
                    j += 1
                dp[i] = min(dp[i], c + dp.get(j,0))
            
        return dp[0]