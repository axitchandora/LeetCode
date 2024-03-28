class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int result = 0;
        int left = 0;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int right=0;right<nums.length;right++){
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            while(freq.get(nums[right])>k){
                freq.put(nums[left],freq.get(nums[left])-1);
                left++;
            }
            result = Math.max(result,(right - left +1));
        }            
        return result;
    }
}