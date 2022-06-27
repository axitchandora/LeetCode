class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqMapOfRansomNote=new int[26];
        int[] freqMapOfMagazine=new int[26];
        for(char ch:ransomNote.toCharArray()){
            freqMapOfRansomNote[ch-'a']++;
        }
        for(char ch:magazine.toCharArray()){
            freqMapOfMagazine[ch-'a']++;
        }
        for(int i=0;i<26;i++)
            if(freqMapOfRansomNote[i]>freqMapOfMagazine[i])
                return false;
        return true;
    }
}