class Solution:
    def getAncestors(self, n, edges):
        adjacency_list = [[] for _ in range(n)]
        ancestors = [[] for _ in range(n)]

        for edge in edges:
            from_node = edge[0]
            to_node = edge[1]
            adjacency_list[from_node].append(to_node)

        for i in range(n):
            self.find_ancestors_DFS(i, adjacency_list, i, ancestors)

        return ancestors

    def find_ancestors_DFS(
        self, ancestor, adjacency_list, current_node, ancestors
    ):
        for child_node in adjacency_list[current_node]:
            if (
                not ancestors[child_node]
                or ancestors[child_node][-1] != ancestor
            ):
                ancestors[child_node].append(ancestor)
                self.find_ancestors_DFS(
                    ancestor, adjacency_list, child_node, ancestors
                )