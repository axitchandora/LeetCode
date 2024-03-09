class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> freqNum=new HashSet();
        for(int i:nums1){
            freqNum.add(i);
        }
        for(int i:nums2){
            if(freqNum.contains(i)){
                return i;
            }
        }
        return -1;
    }
}