class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart=0,maxLength=0,maxRepeatLetterCount=0;
        HashMap<Character,Integer> letterFrequencyMap=new HashMap();
        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            char rightChar=s.charAt(windowEnd);
            letterFrequencyMap.put(rightChar,letterFrequencyMap.getOrDefault(rightChar,0)+1);
            
            maxRepeatLetterCount=Math.max(maxRepeatLetterCount,letterFrequencyMap.get(rightChar));
            
            while(windowEnd-windowStart+1-maxRepeatLetterCount>k){
                char leftChar=s.charAt(windowStart);
                letterFrequencyMap.put(leftChar,letterFrequencyMap.get(leftChar)-1);
                windowStart++;
            }
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
        // Time Complexity - BIG O(N)
        // Space Compexity - BIG O(1)
    }
}