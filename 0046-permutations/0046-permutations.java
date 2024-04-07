
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<Integer>());
        for(int num:nums){            
            int n = permutations.size();
            for(int i=0;i<n;i++){
                List<Integer> oldPermutations= permutations.poll();
                for(int j= 0;j<=oldPermutations.size();j++){
                    List<Integer> newPermutations= new ArrayList<>(oldPermutations);
                    newPermutations.add(j,num);
                    if(newPermutations.size()==nums.length)
                        result.add(newPermutations);
                    else
                        permutations.add(newPermutations);
                }
            }
            
        }
        return result;        
    }
}