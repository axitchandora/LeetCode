class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        res = 0
        for op in operations:
            if op[0] == "+" or op[-1] == "+":
                res += 1
            else:
                res -= 1
        return res