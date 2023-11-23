class Solution {
    public Boolean check(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        Set<Integer> arrSet = new HashSet();
        
        for (int num : arr) {
            minElement = Math.min(minElement, num);
            maxElement = Math.max(maxElement, num);
            arrSet.add(num);
        }
        
        if ((maxElement - minElement) % (arr.length - 1) != 0) {
            return false;
        }
        
        int diff = (maxElement - minElement) / (arr.length - 1);
        int curr = minElement + diff;
        
        while (curr < maxElement) {
            if (!arrSet.contains(curr)) {
                return false;
            }
            
            curr += diff;
        }
        
        return true;
    }
    
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList();
        for (int i = 0; i < l.length; i++) {
            int[] arr = new int[r[i] - l[i] + 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = nums[l[i] + j];
            }
            
            ans.add(check(arr));
        }

        return ans;
    }
}