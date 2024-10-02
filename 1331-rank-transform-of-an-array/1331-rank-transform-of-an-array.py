class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        if not arr:
            return arr
        sorted_arr = sorted(set(arr))
        
        element_to_rank = { ele:rank  for rank, ele in enumerate(sorted_arr, start=1) }
        
        return [element_to_rank[ele] for ele in arr]
        
        