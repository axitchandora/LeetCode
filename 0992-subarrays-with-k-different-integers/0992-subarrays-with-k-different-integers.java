class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = 0, sz = nums.length;
        int[] cnt = new int[sz + 1];
        for (int l = 0, m = 0, r = 0; r < sz; ++r) {
            if (++cnt[nums[r]] == 1)
                if (--k < 0) {
                    cnt[nums[m++]] = 0;
                    l = m;
                }
            if (k <= 0) {
                while (cnt[nums[m]] > 1)
                    --cnt[nums[m++]];
                res += m - l + 1;   
            }
        }    
        return res;
    }
}