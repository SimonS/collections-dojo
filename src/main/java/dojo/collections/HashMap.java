package dojo.collections;

public class HashMap<K, V> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    private Entry[] entries = new Entry[DEFAULT_INITIAL_CAPACITY];

    private int capacity;

    public HashMap() {
        this.capacity = DEFAULT_INITIAL_CAPACITY;
    }

    public void put(K key, V value) {
//        int hash = hash(key.hashCode());
//        int index = hash & (capacity - 1);
//        if (index >= capacity) {
//            int newCapacity = capacity;
//            while (newCapacity < index)
//                newCapacity <<= 1;
//
//            Entry[] newTable = new Entry[newCapacity];
//
//            for (Entry entry: entries) {
//                newTable[entry.hashCode()] = entry;
//            }
//            entries = newTable;
//        }
//        entries[hash] = new Entry(key, value);
    }

    private int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

//    public Object get(K key) {
//        List<Entry> bucketEntries = entries[hash(key.hashCode())];
//        for (Entry bucketEntry: bucketEntries) {
//
//        }
//        return entries[hash(key.hashCode())].value();
//    }
}
