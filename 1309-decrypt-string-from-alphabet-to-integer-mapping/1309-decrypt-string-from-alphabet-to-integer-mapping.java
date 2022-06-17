class Solution {
    public String freqAlphabets(String s) {        
        StringBuilder result=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i<n-2 && s.charAt(i+2)=='#'){
                result.append((char)((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0')+'a'-1));
                i+=2;
            }else
                result.append((char)((s.charAt(i)-'1')+'a'));
        }
        return result.toString();
    }
}