package com.chrisz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList<ClassName> className = new ArrayList<ClassName>();
        // Array lists require a class and we can't place integers directly into a class
        // because they are primitive types

        Integer integerValue = new Integer(54);
        Double doubeValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i)); // <-- boxing // intArrayList.add(i) would be autoboxings
            // valueOf() takes integer value and converts it into class Integer
        }
        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // <-- unboxing
        }

        // short way
        Integer myIntValue = 56; // <-- autoboxing
        int myInt = myIntValue; // <-- auto unboxing, myIntValue.intValue()
    }
}
