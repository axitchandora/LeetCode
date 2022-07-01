class Pair{
    int boxes;
    int unitsPerBox;
    public Pair(int boxes,int unitsPerBox){
        this.boxes=boxes;
        this.unitsPerBox=unitsPerBox;
    }
}

class Solution {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int maximumTotalUnits=0,curTruckSize=0;
        PriorityQueue<Pair> queue=new PriorityQueue<>((a,b)->Integer.compare(b.unitsPerBox,a.unitsPerBox));
        for(int[] boxType:boxTypes)
            queue.add(new Pair(boxType[0],boxType[1]));
        while(!queue.isEmpty() && curTruckSize<truckSize){            
            Pair currPair=queue.poll();
            if(currPair.boxes+curTruckSize<=truckSize){
                maximumTotalUnits+=currPair.boxes*currPair.unitsPerBox;         
                curTruckSize+=currPair.boxes;
            }else{
                int totalBoxesLeft=truckSize-curTruckSize;
                maximumTotalUnits+=totalBoxesLeft*currPair.unitsPerBox;
                currPair.boxes-=totalBoxesLeft;
                curTruckSize+=totalBoxesLeft;
                queue.add(currPair);
            }
        }
        return maximumTotalUnits;
    }
}