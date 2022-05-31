class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int []> intersectedIntervalList=new ArrayList();
        int i=0,j=0;
        while(i < firstList.length && j<secondList.length){
            if(firstList[i][0]>=secondList[j][0] && firstList[i][0]<=secondList[j][1]
              || secondList[j][0]>=firstList[i][0] && secondList[j][0]<=firstList[i][1]){
                intersectedIntervalList.add(new int[]{Math.max(firstList[i][0],secondList[j][0]),Math.min(firstList[i][1],secondList[j][1])});
            }
            if(firstList[i][1]<secondList[j][1]){
                i++;
            } else{
                j++;
            }
                                            
        }
        return intersectedIntervalList.toArray(new int [intersectedIntervalList.size()][]);
    }
}