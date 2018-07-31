package com.cgm.internship.week2day1.part1;


public class Dictionary<K, V> {
    KeyValuePair<K, V> mapList[] = new KeyValuePair[100];

    public V get(K key) {
        int index = getHash(key);
        KeyValuePair<K,V> list = mapList[index];
        return getMatchValue(list, key);
    }

    public void put(K key, V value) {
        int index = getHash(key);
        storeValue(index, key, value);
    }


    private V getMatchValue(KeyValuePair<K, V> list, K key) {
        while (list != null) {
            if (list.getKey().equals(key))
                return list.getValue();
            list = list.next;
        }
        return null;
    }

    private void storeValue(int index, K key, V value) {
        KeyValuePair<K, V> list = mapList[index];

        // if list is empty , enter as first element
        if (list == null) {
            mapList[index] = new KeyValuePair<K, V>(key, value);
        } else {
            boolean done = false;
            // traverse through list , if a key is found ,replace the value or add it at the end of the list
            while(list.next != null) {
                if (list.getKey().equals(key)) {
                    list.setValue(value);
                    done = true;
                    break;
                }
                list = list.next;
            }
            // add at the end of the list
            if (!done)
                list.next = new KeyValuePair<K, V>(key, value);
        }

    }

    private int getHash(K key) {
        int hash = key.hashCode();
        return hash % 100;
    }


}

class KeyValuePair<K, V> {
    K key;
    V value;
    KeyValuePair<K, V> next = null;

    public KeyValuePair<K, V> getNext() {
        return next;
    }

    public void setNext(KeyValuePair<K, V> next) {
        this.next = next;
    }

    public KeyValuePair(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}

