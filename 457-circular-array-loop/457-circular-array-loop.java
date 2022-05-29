class Solution {
    public boolean circularArrayLoop(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int slow=i;
            int fast=i;
            boolean direction=nums[i]>=0;            
            do{
                slow=getNextIndex(nums,direction,slow);
                fast=getNextIndex(nums,direction,fast);
                if(fast!=-1)
                    fast=getNextIndex(nums,direction,fast);
                if(fast==-1 || nums[slow]==0 || nums[fast]==0)
                    break;                
            }while(slow!=fast);
            
            if(slow!=-1 && slow==fast)
                return true;
            nums[i]=0;
        }
        return false;
    }
    private int getNextIndex(int[] nums,boolean direction,int currIndex){
        boolean currDirection=nums[currIndex]>=0;
        if(currDirection!=direction)
            return -1;
        int index=(currIndex+nums[currIndex])%nums.length;
        if(index<0)
            index+=nums.length;
        return index==currIndex?-1:index;
    }
}