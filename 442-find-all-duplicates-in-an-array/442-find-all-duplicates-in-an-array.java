class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1])
                swap(nums,i,nums[i]-1);
            else
                i++;
        }
        List<Integer> duplicatesNumber=new ArrayList();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                duplicatesNumber.add(nums[i]);
        }
        return duplicatesNumber;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}