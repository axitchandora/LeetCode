class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int strCountArray[]=new int[26];
        int patternCountArray[]=new int[26];
        for(char chr:s1.toCharArray()){
            patternCountArray[chr-'a']++;
        }
        int start=0;
        int windowSize=s1.length();
        for(int windowEnd=0;windowEnd<s2.length();windowEnd++){
            strCountArray[s2.charAt(windowEnd)-'a']++;
            if(windowEnd>=windowSize-1){
                if(checkTwoArraysIsEqual(strCountArray,patternCountArray)) return true;
                strCountArray[s2.charAt(start)-'a']--;
                start++;
            }
        }
        return false;
    }
    private static boolean checkTwoArraysIsEqual(int strCountArray[],int patternCountArray[]){
        for(int i=0;i<26;i++){
            if(strCountArray[i]!=patternCountArray[i])return false;
        }
        return true;
    }
    // Time Complexity -BIG O(N+M)
    // Space Complexity - BIG O(1)
}