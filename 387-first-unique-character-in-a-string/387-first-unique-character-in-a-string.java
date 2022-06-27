class Solution {
    public int firstUniqChar(String s) {
        int [] freqMapOfString=new int[26];
        char [] charArray=s.toCharArray();
        for(char ch:charArray){
            freqMapOfString[ch-'a']++;
        }
        for(int i=0;i<charArray.length;i++){
            if(freqMapOfString[charArray[i]-'a']==1)
                return i;
        }
        return -1;
    }
}