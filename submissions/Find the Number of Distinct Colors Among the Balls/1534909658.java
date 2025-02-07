# Title: Find the Number of Distinct Colors Among the Balls
# Submission ID: 1534909658
# Status: Accepted
# Date: February 7, 2025 at 09:41:07 PM GMT+5:30

class Solution {
  public int[] queryResults(int limit, int[][] queries) {
    int[] ans = new int[queries.length];
    Map<Integer, Integer> ballToColor = new HashMap<>();
    Map<Integer, Integer> colorCount = new HashMap<>();

    for (int i = 0; i < queries.length; ++i) {
      final int ball = queries[i][0];
      final int color = queries[i][1];
      if (ballToColor.containsKey(ball)) {
        final int prevColor = ballToColor.get(ball);
        if (colorCount.merge(prevColor, -1, Integer::sum) == 0)
          colorCount.remove(prevColor);
      }
      ballToColor.put(ball, color);
      colorCount.merge(color, 1, Integer::sum);
      ans[i] = colorCount.size();
    }

    return ans;
  }
}