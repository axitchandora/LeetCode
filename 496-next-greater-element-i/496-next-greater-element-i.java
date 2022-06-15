class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                hashmap.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            hashmap.put(stack.pop(),-1);
        }
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=hashmap.get(nums1[i]);
        }
        return result;
    }
}