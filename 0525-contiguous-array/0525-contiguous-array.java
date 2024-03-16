class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        map.put(0,-1);
        int sum = 0;
        int len = nums.length;
        
        for(int i=0;i<len;i++){
            if(nums[i] == 0)
                sum+= -1;
            else
                sum+= +1;
            
            if(map.containsKey(sum))
                result = Math.max(result,i-map.get(sum));
            else
                map.put(sum,i);            
        }       
        return result;        
    }
}