class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] freqMapOfOrder= new int[26];
        for(int i=0;i<order.length();i++)
            freqMapOfOrder[order.charAt(i)-'a']=i;
        for(int i=1;i <words.length;i++){
            if(comparingAdjacentString(words[i-1],words[i],freqMapOfOrder)) return false;
        }
        return true;
    }
    private boolean comparingAdjacentString(String s1,String s2,int[] freqMap){
        int n1=s1.length();
        int n2=s2.length();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(s1.charAt(i)!=s2.charAt(j)) return freqMap[s1.charAt(i)-'a']>freqMap[s2.charAt(j)-'a'];
            i++;
            j++;
        }
        return n1>n2;
    }
}