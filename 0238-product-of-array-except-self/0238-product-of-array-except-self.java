class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];        
     
        result[0] = 1;
        for(int i=1;i<len;i++){
            result[i]=result[i-1]*nums[i-1];
        }        
        
        int right = 1;
        for(int i=len-1;i>=0;i--){
            result[i]=result[i]*right;
            right = right*nums[i];
        }        
      
        return result;
    }
}