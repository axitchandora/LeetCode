class Solution {
    public int longestOnes(int[] nums, int k) {
        int windowStart=0,maxLength=0,maxOnesCount=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            if(nums[windowEnd]==1) maxOnesCount++;
            
            if((windowEnd-windowStart+1)-maxOnesCount>k){
                if(nums[windowStart]==1) maxOnesCount--;
                windowStart++;
            }
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
        // Time Complexity - BIG O(N)
        // Space Compexity - BIG O(1)
    }
}