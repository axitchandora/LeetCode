class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result=new ArrayList<>();
        int [] maxFreqCount=countFreq("");
        for(String b:words2){
            int[] currFreqCount=countFreq(b);
            for(int i=0;i<26;i++){
                maxFreqCount[i]=Math.max(currFreqCount[i],maxFreqCount[i]);
            }
        }
        
        for(String a:words1){
            boolean isValid=false;
            int[] currFreqCount=countFreq(a);
            for(int i=0;i<26;i++){
                if(maxFreqCount[i]>currFreqCount[i]){
                    isValid=true;
                    continue;
                }
            }
            if(isValid)continue;                    
            result.add(a);
        }
        return result;
    }
    private int[] countFreq(String s){
        int count[]=new int[26];
        for(char chr:s.toCharArray()){
            count[chr-'a']++;
        }
        return count;
    }
}