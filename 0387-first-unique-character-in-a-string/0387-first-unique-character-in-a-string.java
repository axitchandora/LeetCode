class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<n;i++){            
            if(freq[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}