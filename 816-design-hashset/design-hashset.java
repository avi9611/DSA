class MyHashSet {
    private final int SIZE = 1000;
    private List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for(int i = 0; i < SIZE; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key){
        return key % SIZE;
    }
    
    public void add(int key) {
        int idx = hash(key);
        List<Integer> bucket = buckets[idx];
        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int idx = hash(key);
        List<Integer> bucket = buckets[idx];
        bucket.remove((Integer)key);
    }
    
    public boolean contains(int key) {
        int idx = hash(key);
        List<Integer> bucket = buckets[idx];
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */