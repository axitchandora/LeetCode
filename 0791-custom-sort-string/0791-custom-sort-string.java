class Solution {
    public String customSortString(String order, String s) {
        int n= s.length();
        Character[] result = new Character[n];
        for(int i=0;i<n;i++){
            result[i]=s.charAt(i);
        }
        Arrays.sort(result, (c1, c2)->{
            return order.indexOf(c1) - order.indexOf(c2);
        });
        
        String resultString = "";
        for(Character ch:result){
            resultString += ch;
        }
        return resultString;       
    }
}