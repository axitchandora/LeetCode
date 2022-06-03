class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1)
            {
                if(nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                }else  // we have found the duplicate
                    return nums[i];
            }
            else
                i++;
        }
        return -1;
    }
    private void swap(int arr[],int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}