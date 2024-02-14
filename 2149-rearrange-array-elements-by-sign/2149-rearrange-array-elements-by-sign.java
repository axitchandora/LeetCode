class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // Initializing an answer array of size n
        int[] ans = new int[n];

        // Initializing two pointers to track even and 
        // odd indices for positive and negative integers respectively
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                // Placing the positive integer at the 
                // desired index in ans and incrementing posIndex by 2
                ans[posIndex] = nums[i];
                posIndex += 2;
            } else {
                // Placing the negative integer at the 
                // desired index in ans and incrementing negIndex by 2
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }

        return ans;
    }
}