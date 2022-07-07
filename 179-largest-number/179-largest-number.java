class Solution {
    public String largestNumber(int[] nums) {
        Integer[] boxedNums=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            boxedNums[i]=nums[i];
        }
        Arrays.sort(boxedNums,(a,b)->{
            String order1=""+a+b;
            String order2=""+b+a;
            return order2.compareTo(order1);
        });
        if(boxedNums[0]==0) return "0";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<boxedNums.length;i++)
            sb.append(boxedNums[i]);
        return sb.toString();
    }
}