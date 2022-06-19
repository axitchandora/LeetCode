class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqCountOfS=new int[26];
        int[] freqCountOfT=new int[26];
        for(char chr:s.toCharArray())
            freqCountOfS[chr-'a']++;
        for(char chr:t.toCharArray())
            freqCountOfT[chr-'a']++;
        for(int i=0;i<26;i++)
            if(freqCountOfS[i]!=freqCountOfT[i])return false;
        return true;
    }
}