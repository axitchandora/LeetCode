class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        // Using BFS Algo
        // To Store Mapping Of Bus No. with Routes
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        // Visited For Bus No.
        HashSet<Integer> visitedForBusNo=new HashSet<>();
        // Visited For Routes
        HashSet<Integer> visitedForRoutes=new HashSet<>();
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        
        // Mapping - Bus No. with Routes
        for(int i=0;i<routes.length;i++){
            for(int j=0;j<routes[i].length;j++){
                ArrayList<Integer> arrayls=map.getOrDefault(routes[i][j],new ArrayList<Integer>());
                arrayls.add(i);
                map.put(routes[i][j],arrayls);
            }
        }
        int minBuses=0;
        // Adding source to queue & visitedForBusNo
        queue.add(source);
        visitedForBusNo.add(source);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-- >0){
                int removedBusNo=queue.poll();
                if(removedBusNo==target)return minBuses;
                ArrayList<Integer> removedRoutes=map.get(removedBusNo);
                for(int r:removedRoutes){
                    if(!visitedForRoutes.contains(r)){
                        for(int b:routes[r]){
                            if(!visitedForBusNo.contains(b)){
                                visitedForBusNo.add(b);
                                queue.add(b);
                            }
                        }                        
                       visitedForRoutes.add(r);
                    }
                }
            }
            minBuses++;
        }
        return -1;
    }
}