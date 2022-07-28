class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> permutations=new ArrayList();
        if(s==null)return permutations;
        permutations.add(s);
        // process every character of the string one by one
        for(int i=0;i<s.length();i++){
            // only process characters, skip digits
            if(Character.isLetter(s.charAt(i))){
                // we will take all existing permutations and change the letter case appropriately
                int n=permutations.size();
                for(int j=0;j<n;j++){
                    char[] chs=permutations.get(j).toCharArray();
                    // if the current character is in upper case change it to lower case or vice versa
                    if(Character.isUpperCase(chs[i]))
                        chs[i]=Character.toLowerCase(chs[i]);
                    else
                        chs[i]=Character.toUpperCase(chs[i]);
                    
                    permutations.add(String.valueOf(chs));   
                }
                
            }            
        }
        return permutations;
    }
}