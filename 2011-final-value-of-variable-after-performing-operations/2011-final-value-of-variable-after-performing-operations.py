class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        opera_map= {
            "++X": 1,
            "X++": 1,
            "--X":-1,
            "X--":-1
        }
        res = 0
        for op in operations:
            res += opera_map[op]
        return res