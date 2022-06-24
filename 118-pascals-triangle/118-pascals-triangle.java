class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList();
        if(numRows<=0) return triangle;
        for(int i=0;i<numRows;i++){
            List<Integer> currentRow=new ArrayList();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i)
                    currentRow.add(1);
                else
                    currentRow.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            triangle.add(currentRow);
        }
        return triangle;
    }
}