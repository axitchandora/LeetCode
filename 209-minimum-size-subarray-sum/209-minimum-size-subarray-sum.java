class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Using Sliding Window Approach
        int minLength=Integer.MAX_VALUE;
        int windowSum=0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            windowSum+=nums[windowEnd];
            while(windowSum>=target){
                minLength=Math.min(minLength,windowEnd-windowStart+1);
                windowSum-=nums[windowStart++];
            }
        }
        return (minLength==Integer.MAX_VALUE)?0:minLength;
        // Time Complexity - Big O(N+N)
        // Space Complexity - Big O(1)
    }
}