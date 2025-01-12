# Title: Number of Ways to Split Array
# Submission ID: 1496451857
# Status: Accepted
# Date: January 3, 2025 at 09:59:43 PM GMT+5:30

class Solution {
  public int waysToSplitArray(int[] nums) {
    int ans = 0;
    long prefix = 0;
    long suffix = Arrays.stream(nums).asLongStream().sum();

    for (int i = 0; i < nums.length - 1; ++i) {
      prefix += nums[i];
      suffix -= nums[i];
      if (prefix >= suffix)
        ++ans;
    }

    return ans;
  }
}