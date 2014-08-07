package dojo.collections;

public class Entry<K, V> {

    private final K key;
    private final V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V value() {
        return value;
    }
}
