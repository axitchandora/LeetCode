class Solution {
    public void sortColors(int[] nums) {
        int start=0,end=nums.length-1;
        int i=0,tmp;
        while(i<=end){
            if(nums[i]==0){
                tmp=nums[i];
                nums[i]=nums[start];
                nums[start]=tmp;
                start++;
            }else if(nums[i]==2){
                tmp=nums[i];
                nums[i]=nums[end];
                nums[end]=tmp;
                end--;
                i--;
            }
            i++;
        }
    }
}