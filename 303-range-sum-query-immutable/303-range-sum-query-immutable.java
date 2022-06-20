class NumArray {
    int[] prefixSumArray;

    public NumArray(int[] nums) {
        prefixSumArray=new int [nums.length];
        prefixSumArray[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSumArray[i]=prefixSumArray[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefixSumArray[right];
        return prefixSumArray[right]-prefixSumArray[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */