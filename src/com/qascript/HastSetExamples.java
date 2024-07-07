package com.qascript;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class HastSetExamples {

    public static void main(String args[]){

        List<String> values = new ArrayList<>();
        values.add("Java");
        values.add(".Net");
        values.add("Python");
        values.add(".Net");
        values.add("Python");

        HashSet<String> removeDuplicates = new HashSet<>();
        removeDuplicates.addAll(values);
        for(String s:removeDuplicates){
            System.out.println(s);
        }
    }
}
