class Solution:
    def treeQueries(
        self, root: Optional[TreeNode], queries: List[int]
    ) -> List[int]:
        result_map = {}
        height_cache = {}

        def _height(node):
            if not node:
                return -1

            if node in height_cache:
                return height_cache[node]

            h = 1 + max(_height(node.left), _height(node.right))
            height_cache[node] = h
            return h

        def _dfs(node, depth, max_val):
            if not node:
                return

            result_map[node.val] = max_val

            _dfs(
                node.left,
                depth + 1,
                max(max_val, depth + 1 + _height(node.right)),
            )
            _dfs(
                node.right,
                depth + 1,
                max(max_val, depth + 1 + _height(node.left)),
            )

        _dfs(root, 0, 0)

        return [result_map[q] for q in queries]