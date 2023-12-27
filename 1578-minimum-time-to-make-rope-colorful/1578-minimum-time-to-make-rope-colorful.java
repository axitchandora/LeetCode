class Solution {
public int minCost(String s, int[] cost) {
    int res = cost[0], max_cost = cost[0];
    for (int i = 1; i < s.length(); ++i) {
        if (s.charAt(i) != s.charAt(i - 1)) {
            res -= max_cost;
            max_cost = 0;
        }
        res += cost[i];
        max_cost = Math.max(max_cost, cost[i]);
    }
    return res - max_cost;
}
}