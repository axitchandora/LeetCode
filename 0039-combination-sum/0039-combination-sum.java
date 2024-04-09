class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates,0,target,new ArrayList<>(),result);
        return result;
        
    }    
    private void dfs(int[] candidates,int current ,int target,List<Integer> currentComb,List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList(currentComb));
            return;
        }
        for(int i=current;i<candidates.length;i++){
            if(target < candidates[i])
                continue;
            currentComb.add(candidates[i]);
            dfs(candidates,i,target-candidates[i],currentComb,result); 
            currentComb.remove(currentComb.size()-1);
        }
        
    }
}