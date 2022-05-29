class Solution {
    public boolean circularArrayLoop(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int slow=i;
            int fast=i;
            float direction=Math.signum(nums[i]);            
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
    private int getNextIndex(int[] nums,float direction,int currIndex){
        float currDirection=Math.signum(nums[currIndex]);
        if(currDirection*direction<0)
            return -1;
        int index=(currIndex+nums[currIndex])%nums.length;
        if(index<0)
            index+=nums.length;
        return index==currIndex?-1:index;
    }
}