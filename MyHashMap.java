class MyHashMap {
    private List<Integer> keys;
    private List<Integer> values;
    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(keys.contains(key)){
            int index = keys.indexOf(key);
            values.set(index, value);
        }else{
            keys.add(key);
            values.add(value);
        }
    }
    
    public int get(int key) {
        int index = keys.indexOf(key);
        return index==-1 ? -1:values.get(index);
    }
    
    public void remove(int key) {
        int index = keys.indexOf(key);
        if(index != -1){    
            keys.remove(index);
            values.remove(index);
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
