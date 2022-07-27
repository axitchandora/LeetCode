class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        generatePermutationsRecursive(nums,0,new ArrayList(),result);
        return result;
    }
    private static void generatePermutationsRecursive(int[] nums, int index, List<Integer> currentPermutation,
      List<List<Integer>> result){
        if(currentPermutation.size()==nums.length){
            result.add(currentPermutation);
            return;
        }else{
            
            for(int i=0;i<=currentPermutation.size();i++){
                List<Integer> newPermutation=new ArrayList(currentPermutation);
                newPermutation.add(i,nums[index]);
                generatePermutationsRecursive(nums,index+1,newPermutation,result);
            }
        }
            
    }
}