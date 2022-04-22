class Pair<K,V>{
    public K first;
    public V second;
    
    public Pair(K first,V second){
        this.first=first;
        this.second=second;
    }
}
class MyHashMap {
    private int key_space;
    private List<Bucket> hash_table;

    public MyHashMap() {
        this.key_space = 2069;
        this.hash_table= new ArrayList<Bucket>();
        for(int i=0;i< this.key_space;i++){
            this.hash_table.add(new Bucket());
        }
        
    }
    
    public void put(int key, int value) {
        int hash_key = key % this.key_space;
        
        this.hash_table.get(hash_key).update(key,value);
    }
    
    public int get(int key) {
        int hash_key = key % this.key_space;
        
        return this.hash_table.get(hash_key).get(key);
    }
    
    public void remove(int key) {
        int hash_key = key % this.key_space;
        
        this.hash_table.get(hash_key).remove(key);        
    }
}

class Bucket{
    private List<Pair<Integer, Integer>> bucket;
    
    public Bucket(){
        this.bucket =new LinkedList<Pair<Integer, Integer>>();
    };
    
    public Integer get(Integer key){
        for(Pair<Integer, Integer> pair: this.bucket){
            if(pair.first.equals(key))
                return pair.second;
        }
        return -1;
    }
    
    public void update(Integer key, Integer value){
        boolean found = false;
        for(Pair<Integer, Integer> pair: this.bucket){
            if(pair.first.equals(key)){
                pair.second = value;
                found = true;
            }
        }
        if( !found)
            this.bucket.add(new Pair<Integer, Integer>(key, value));
    }
    
    public void remove(Integer key){
        for(Pair<Integer, Integer> pair: this.bucket){
            if(pair.first.equals(key)){
                this.bucket.remove(pair);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */