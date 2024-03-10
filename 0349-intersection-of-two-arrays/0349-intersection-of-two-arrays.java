class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> freq1=new HashSet<>();
        Set<Integer> freq2=new HashSet<>();
        List<Integer> result=new LinkedList<>();
        for(int i:nums1){
            freq1.add(i);
        }
        for(int i:nums2){
            freq2.add(i);
        }
        for(int i:freq2){
            if(freq1.contains(i)){
                result.add(i);
            }            
        }
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
        
    }
}