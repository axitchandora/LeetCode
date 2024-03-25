class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList();
        
        for(int num:nums){
            nums[Math.abs(num) - 1] *= -1;
            if(nums[Math.abs(num) - 1]>0){
                result.add(Math.abs(num));
            }
        }
        return result;
    }
}