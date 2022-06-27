class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqMapOfMagazine=new int[26];
        for(char ch:magazine.toCharArray()){
            freqMapOfMagazine[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(freqMapOfMagazine[ch-'a']==0) return false;
            freqMapOfMagazine[ch-'a']--;
        }
        return true;
    }
}