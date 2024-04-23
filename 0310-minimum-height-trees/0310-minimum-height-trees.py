class Solution:
    def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
        if n == 1:
            return [0]
        
        adj = defaultdict(list)
        for u,v in edges:
            adj[u].append(v)
            adj[v].append(u)
            
        edge_cnt = {}
        leaves = deque()
        
        for src, neighbors in adj.items():
            if len(neighbors) == 1:
                leaves.append(src)
            edge_cnt[src]= len(neighbors)
            
        while leaves:
            if n <=2 :
                return list(leaves)
            for i in range(len(leaves)):
                node = leaves.popleft()
                n -= 1
                for nei in adj[node]:
                    edge_cnt[nei] -= 1
                    if edge_cnt[nei] == 1:
                        leaves.append(nei)
        
        