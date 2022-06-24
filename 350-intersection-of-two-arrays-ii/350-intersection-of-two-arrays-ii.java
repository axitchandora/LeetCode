class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersectionElement=new LinkedList();
        Map<Integer,Integer> freqMapOfFirstElement=new HashMap();
        for(int i:nums1)
            freqMapOfFirstElement.put(i,freqMapOfFirstElement.getOrDefault(i,0)+1);
        for(int i:nums2){
            if(freqMapOfFirstElement.containsKey(i) && freqMapOfFirstElement.get(i)>0)                
                intersectionElement.add(i);
            freqMapOfFirstElement.put(i,freqMapOfFirstElement.getOrDefault(i,0)-1);
        }
        int[] result=new int[intersectionElement.size()];
        for(int i=0;i<intersectionElement.size();i++)
            result[i]=intersectionElement.get(i);
        return result;
    }
}