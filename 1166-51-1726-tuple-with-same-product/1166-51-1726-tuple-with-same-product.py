class Solution:
    def tupleSameProduct(self, nums: List[int]) -> int:
        product_cnt = defaultdict(int) # n1 * n2 -> count

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                product = nums[i] * nums[j]
                product_cnt[product] += 1

        res = 0
        for cnt in product_cnt.values():
            paris = (cnt * (cnt - 1)) // 2
            res += 8 * paris
        return res


        