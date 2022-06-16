class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int k=0,i=0,j=0;    
        char [] resutantArray=new char[n1+n2];
        while(i<n1 && j<n2){
            resutantArray[k++]=word1.charAt(i++);
            resutantArray[k++]=word2.charAt(j++);
        }
        while(i<n1){
            resutantArray[k++]=word1.charAt(i++);
        }
        while(j<n2){
            resutantArray[k++]=word2.charAt(j++);
        }
        return new String(resutantArray);
    }
}