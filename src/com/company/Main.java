package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

      Pair<Integer,String> test = new Pair<>(1,"one");
        Pair<Integer,String> test2 = new Pair<>(2,"two");
        Pair<Integer,String> test3 = new Pair<>(1,"dfjgdjfh");

        Object [] array = new Object[]{test3, test, test2};
        PairCollection<Integer,String> collection = new PairCollection<>(array);

        Object[] arrayPair = collection.getAllItems();

        Arrays.sort(arrayPair);


            System.out.println( collection.getKeysCount(2));


    }
}
