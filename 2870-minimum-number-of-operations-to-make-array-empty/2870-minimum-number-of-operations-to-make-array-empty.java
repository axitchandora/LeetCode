class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num: nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int c: counter.values()) {
            if (c == 1) {
                return -1;
            }
            ans += Math.ceil((double) c / 3);
        }
        return ans;
        
    }
}