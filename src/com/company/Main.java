package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      PairHolder<Integer,String> test = new PairHolder<>(1,"one");
        PairHolder<Integer,String> test2 = new PairHolder<>(2,"two");

        Object [] array = new Object[]{test, test2};
        PairCollection<Integer,String> collection = new PairCollection<>(array);


        System.out.println(collection.getValue(1));
        System.out.println(collection.getValue(2));
    }
}
