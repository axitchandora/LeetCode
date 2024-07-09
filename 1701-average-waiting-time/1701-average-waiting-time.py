class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        t = 0
        result = 0
        for start, end in customers:
            result += max(t - start,0)
            t = max(t,start)
            result += end
            t += end
        return result/len(customers)
        