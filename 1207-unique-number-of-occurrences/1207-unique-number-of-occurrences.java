class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq= new HashMap();
        Set<Integer> set=new HashSet();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],1)+1);
        }
        int val;
        for(int i:freq.keySet()){
            val=freq.get(i);
            System.out.println(i+" "+val);
            if(set.contains(val))
                return false;
            set.add(val);
        }
        return true;
    }
}