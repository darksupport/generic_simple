package com.company;

/**
 * Created by Brainacad4 on 09.04.2018.
 */
public class PairHolder<K,V> implements IPairHolder<K,V> {

    K key;
    V val;

    public PairHolder(K key,V value)
    {
        this.key = key;
        this.val = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return val;
    }

    @Override
    public void setValue(V val) {
        this.val = val;
    }

}
