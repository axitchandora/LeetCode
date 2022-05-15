class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Using Sliding Window pattern
        int windowStart=0,maxLength=0;
        HashMap<Character,Integer> charIndexMap=new HashMap();
        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            char rightChar=s.charAt(windowEnd);
            // if the map already contains the 'rightChar', shrink the window from the beginning so that
            // we have only one occurrence of 'rightChar'
            if(charIndexMap.containsKey(rightChar)){
            // this is tricky; in the current window, we will not have any 'rightChar' after its previous index
            // and if 'windowStart' is already ahead of the last index of 'rightChar', we'll keep 'windowStart'
                windowStart=Math.max(windowStart,charIndexMap.get(rightChar)+1);
            }
            charIndexMap.put(rightChar,windowEnd);// insert the 'rightChar' into the map
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);// remember the maximum length so far
        }
        return maxLength;
        // Time Complexity - BIG O(N), where ‘N’ is the number of characters in the input string.
        // Space Complexity - BIG O(1)
    }
}