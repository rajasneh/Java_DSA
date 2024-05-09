package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap_Implementation {

    public static class MyHashMap<K, V> {
        private static final int DEFAULT_CAPACITY = 16;
        private static final double LOAD_FACTOR_THRESHOLD = 0.75;

        private ArrayList<LinkedList<Entry<K, V>>> buckets;
        private int size;

        public MyHashMap() {
            buckets = new ArrayList<>(DEFAULT_CAPACITY);
            for (int i = 0; i < DEFAULT_CAPACITY; i++) {
                buckets.add(new LinkedList<>());
            }
            size = 0;
        }

        public void put(K key, V value) {
            int index = getIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets.get(index);

            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
            }

            bucket.add(new Entry<>(key, value));
            size++;

            if ((double) size / buckets.size() >= LOAD_FACTOR_THRESHOLD) {
                resize();
            }
        }

        public V get(K key) {
            int index = getIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets.get(index);

            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }

            return null;
        }

        public void remove(K key) {
            int index = getIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets.get(index);

            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) {
                    bucket.remove(entry);
                    size--;
                    return;
                }
            }
        }

        private int getIndex(K key) {
            return Math.abs(key.hashCode() % buckets.size());
        }

        private void resize() {
            ArrayList<LinkedList<Entry<K, V>>> newBuckets = new ArrayList<>(buckets.size() * 2);
            for (int i = 0; i < buckets.size() * 2; i++) {
                newBuckets.add(new LinkedList<>());
            }

            for (LinkedList<Entry<K, V>> bucket : buckets) {
                for (Entry<K, V> entry : bucket) {
                    int newIndex = Math.abs(entry.getKey().hashCode() % newBuckets.size());
                    newBuckets.get(newIndex).add(entry);
                }
            }

            buckets = newBuckets;
        }

        private static class Entry<K, V> {
            private final K key;
            private V value;

            public Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public K getKey() {
                return key;
            }

            public V getValue() {
                return value;
            }

            public void setValue(V value) {
                this.value = value;
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 30);
        hashMap.put("grapes", 40);

        // Getting values based on keys
        System.out.println("Value of apple: " + hashMap.get("apple")); // Output: Value of apple: 10
        System.out.println("Value of banana: " + hashMap.get("banana")); // Output: Value of banana: 20

        // Removing a key-value pair
        hashMap.remove("orange");

        // Getting a value after removal
        System.out.println("Value of orange: " + hashMap.get("orange")); // Output: Value of orange: null
    }
}

