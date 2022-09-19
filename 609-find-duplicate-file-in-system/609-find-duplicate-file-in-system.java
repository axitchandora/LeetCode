class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map=new HashMap<>();
        for(String path:paths){
            String[] arrOfPath=path.split(" ");
            for(int i=1;i<arrOfPath.length;i++){
                String[] fileCont=arrOfPath[i].split("\\(");
                fileCont[1]=fileCont[1].replace(")","");
                List<String> listOfString=map.getOrDefault(fileCont[1],
                                                        new ArrayList<String>());
                listOfString.add(arrOfPath[0]+ "/" + fileCont[0]);
                map.put(fileCont[1],listOfString);
            }
        }
        List<List<String>> result=new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key).size()>1){
                result.add(map.get(key));
            }
        }
        return result;
    }
}