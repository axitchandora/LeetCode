class Solution {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i=0; i<nums.length; i++) strNums[i] = Integer.toString(nums[i]);
        Arrays.sort(strNums,(a,b)->{
            String order1=""+a+b;
            String order2=""+b+a;
            return order2.compareTo(order1);
        });
        if(strNums[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strNums.length;i++)
            sb.append(strNums[i]);
        return sb.toString();
    }
}