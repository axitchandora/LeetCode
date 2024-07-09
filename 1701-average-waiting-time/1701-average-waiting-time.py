class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        t = 0
        result = 0
        for start, end in customers:
            if t > start:
                result += t - start
            else:
                t = start
            result += end
            t += end
        return result/len(customers)
        