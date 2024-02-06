class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups =new HashMap<>();
        
        for(String s:strs){
            char[] chars= s.toCharArray();
            Arrays.sort(chars);
            
            String key=String.valueOf(chars);
            groups.putIfAbsent(key,new ArrayList<>());
            groups.get(key).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}