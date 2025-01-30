class Solution:
    def magnificentSets(self, n: int, edges: List[List[int]]) -> int:
        adj = defaultdict(list)
        for n1, n2 in edges:
            adj[n1].append(n2)
            adj[n2].append(n1)

        def get_connected_component(src):
            q = deque([src])
            component = set([src])
            while q:
                node = q.popleft()
                for nei in adj[node]:
                    if nei in component:
                        continue
                    q.append(nei)
                    component.add(nei)
                    visit.add(nei)
            return component
        
        def longest_path(src):
            q = deque([(src, 1)]) # (node, group)
            dist = {src:1} # node -> length from src + 1

            while q:
                node, length = q.popleft()
                for nei in adj[node]:
                    if nei in dist:
                        if dist[nei] not in (length+1, length-1): #if dist[nei] == length:
                            return -1
                        continue
                    q.append((nei, length + 1))
                    dist[nei] = length + 1
            return max(dist.values())

        visit = set()
        res = 0
        for i in range(1, n + 1):
            if i in visit:
                continue

            visit.add(i)
            component = get_connected_component(i)

            max_cnt = 0
            for src in component:
                length = longest_path(src)
                if length == -1:
                    return -1
                max_cnt = max(max_cnt, length)
            res += max_cnt
        return res

        