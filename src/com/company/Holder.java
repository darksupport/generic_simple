package com.company;

/**
 * Created by Brainacad4 on 09.04.2018.
 */
public class Holder<T> {

    private  T value;
    public Holder()
    {

    }
    public  void setValue(T val)
    {
        this.value = val;
    }

    public  T getValue()
    {
        return this.value;
    }
}
