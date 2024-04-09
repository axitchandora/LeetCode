class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());        
        for(int num:nums){
            int n = result.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> currentSubsets = new ArrayList<>(result.get(i));
                currentSubsets.add(num);
                result.add(currentSubsets);
            }
        }
        return result;     
    }
}