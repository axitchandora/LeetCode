class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean contains1 = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                contains1 = true;
            }
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }      
        }

        if (!contains1) return 1;
        for (int i = 0; i < n; i++) {
            int value = Math.abs(nums[i]);
            if (value == n) {
                nums[0] = - Math.abs(nums[0]);
            } else {
                nums[value] = - Math.abs(nums[value]);
            }       
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0)
                return i;
        }
        if (nums[0] > 0){
            return n;
        }
        return n + 1;
    }
}