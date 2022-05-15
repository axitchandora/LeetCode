class Solution {
    public int totalFruit(int[] fruits) {
        // Using Sliding Window
        int maxLength=0,windowStart=0;
        HashMap<Integer,Integer> fruitFrequencyMap=new HashMap();
        for(int windowEnd=0;windowEnd<fruits.length;windowEnd++){
            fruitFrequencyMap.put(fruits[windowEnd],fruitFrequencyMap.getOrDefault(fruits[windowEnd],0)+1);       
            while(fruitFrequencyMap.size()>2){
                fruitFrequencyMap.put(fruits[windowStart],fruitFrequencyMap.get(fruits[windowStart])-1);
                if(fruitFrequencyMap.get(fruits[windowStart])==0)
                    fruitFrequencyMap.remove(fruits[windowStart]);
                windowStart++;
            }
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
        // Time Complexity - Big O(N)
        // Space Complexity - Big O(N)
    }
}