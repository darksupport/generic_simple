package com.company;


/**
 * Created by Brainacad4 on 09.04.2018.
 */
public class PairCollection<K extends Number & Comparable,V> {

    public Object [] array;
    public PairCollection(Object [] array)
    {
        this.array = array;
    }


    public Object[] getAllItems()
    {
        return array;
    }

    public V getValue(K key)
    {
        for ( Object holder:array) {
        if (((Pair<K,V>)holder).getKey() == key)
        {
            return ((Pair<K,V>)holder).getValue();
        }
    }
        return null;
    }

    public int getKeysCount(K key)
    {
        int result =0;
        for (Object pair: this.array) {
            if (((Pair<K,V>)pair).getKey()==key)
            {
                result++;
            }
        }
        return result;
    }
}
