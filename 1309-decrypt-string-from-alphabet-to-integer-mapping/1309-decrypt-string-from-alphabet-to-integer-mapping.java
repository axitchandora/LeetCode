class Solution {
    public String freqAlphabets(String s) {        
        StringBuilder result=new StringBuilder();
        char[] charArray=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i<n-2 && charArray[i+2]=='#'){
                result.append((char)((charArray[i]-'0')*10+(charArray[i+1]-'0')+'a'-1));
                i+=2;
            }else
                result.append((char)((charArray[i]-'1')+'a'));
        }
        return result.toString();
    }
}