class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result=new ArrayList();
        for(String word:words){
            if(isMatched(word,pattern))
                result.add(word);
        }
        return result;
    }
    private boolean isMatched(String word,String pattern){
        HashMap<Character,Character> m1=new HashMap();
        HashMap<Character,Character> m2=new HashMap();
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
            char p=pattern.charAt(i);
            if(!m1.containsKey(w)) m1.put(w,p);
            if(!m2.containsKey(p)) m2.put(p,w);
            if(m1.get(w)!=p || m2.get(p)!=w) return false;
        }
        return true;
    }
}