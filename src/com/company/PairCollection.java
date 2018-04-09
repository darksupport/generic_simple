package com.company;

/**
 * Created by Brainacad4 on 09.04.2018.
 */
public class PairCollection<K,V> {

    public Object [] array;
    public PairCollection(Object [] array)
    {
        this.array = array;
    }


    public V getValue(K key)
    {
        for ( Object holder:array) {
        if (((PairHolder<K,V>)holder).getKey() == key)
        {
            return ((PairHolder<K,V>)holder).getValue();
        }
    }
        return null;
    }
}
