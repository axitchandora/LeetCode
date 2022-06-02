class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        // Using Cyclic Sort Algo        
        while(i<nums.length){
            int j=nums[i];
            if(j<nums.length && nums[i]!=nums[j])
                swap(nums,i,j);
            else
                i++;
        }
        // find the first number missing from its index, that will be our required number
        for(i=0;i<nums.length;i++)
            if(nums[i]!=i)
                return i;
        return nums.length;
    }
    private void swap(int [] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}