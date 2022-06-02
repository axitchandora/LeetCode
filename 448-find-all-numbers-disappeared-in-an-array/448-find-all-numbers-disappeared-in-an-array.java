class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> listOfDisappearedNumbers=new ArrayList();
        int i=0;
        while(i<nums.length){
            int j=nums[i]-1;
            if(nums[i]!=nums[j])
                swap(nums,i,j);
            else
                i++;
        }
        for(i=0;i<nums.length;i++){
            if(i!=nums[i]-1)
                listOfDisappearedNumbers.add(i+1);
        }
        return listOfDisappearedNumbers;
    }
    private void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}