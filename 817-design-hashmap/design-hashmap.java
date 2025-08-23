class MyHashMap {
    private List<int[]>[] buckets;
    private int size = 1000;

    public MyHashMap() {
        buckets = new ArrayList[size];
        for(int i = 0; i < size; i++){
            buckets[i] = new ArrayList<>();
        }
    }

    private int hash(int key){
        return key % size;
    }
    
    public void put(int key, int value) {
        int idx = hash(key);
        List<int[]> bucket = buckets[idx];

        for(int[] pair: bucket){
            if(pair[0] == key){
                pair[1] = value;
                return;
            }
        }
        bucket.add(new int[]{key, value});
    }
    
    public int get(int key) {
        int idx = hash(key);
        List<int[]> bucket = buckets[idx];

        for(int[] pair: bucket){
            if(pair[0] == key){
                return pair[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx = hash(key);
        List<int[]> bucket = buckets[idx];
        
        for(int i = 0; i < bucket.size(); i++){
            if(bucket.get(i)[0] == key){
                bucket.remove(i);
                return;
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