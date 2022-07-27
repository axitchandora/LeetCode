class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        // start by adding the empty subset
        result.add(new ArrayList<Integer>());
        for(int num:nums){
            // we will take all existing subsets and insert the current number in them to create new subsets
            int n=result.size();
            for(int i=0;i<n;i++){
                // create a new subset from the existing subset and insert the current element to it
                List<Integer> set=new ArrayList(result.get(i));
                set.add(num);
                result.add(set);
            }
        }
        return result;
    }
}