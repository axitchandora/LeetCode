class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        int result=0;
        int maxFreq=-1;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>maxFreq){
                maxFreq=freq[nums[i]];
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxFreq){
                result+=maxFreq;
            }
        }        
        return result;
    }
}