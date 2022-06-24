class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstIdx=m-1,secondIdx=n-1,resultIdx=n+m-1;
        while(firstIdx>=0 && secondIdx>=0){
            if(nums1[firstIdx]>nums2[secondIdx]){
                nums1[resultIdx--]=nums1[firstIdx--];
            }else{
                nums1[resultIdx--]=nums2[secondIdx--];
            }
        }
        while(resultIdx>=0 && secondIdx>=0)
            nums1[resultIdx--]=nums2[secondIdx--];        
    }
}