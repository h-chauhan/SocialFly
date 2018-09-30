package com.himanshu.socialfly.POJO;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleData {
    private static ArrayList<Customer> list = new ArrayList<>();

    public static ArrayList<Customer> getData() {
        if(list.isEmpty()) {
            ArrayList<String> interests1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
            ArrayList<String> interests2 = new ArrayList<>(Arrays.asList("a", "d", "e"));
            ArrayList<String> interests3 = new ArrayList<>(Arrays.asList("a", "c", "d"));
            ArrayList<String> interests4 = new ArrayList<>(Arrays.asList("a", "b", "c"));
            ArrayList<String> interests5 = new ArrayList<>(Arrays.asList("a", "d", "e"));
            ArrayList<String> passenger1 = new ArrayList<>(Arrays.asList("Tony Stark", "James Rhodes"));
            ArrayList<String> passenger2 = new ArrayList<>(Arrays.asList("Steve Rogers", "Samuel Wilson"));
            ArrayList<String> passenger3 = new ArrayList<>(Arrays.asList("Peter Parker"));
            ArrayList<String> passenger4 = new ArrayList<>(Arrays.asList("Bruce Banner"));
            ArrayList<String> passenger5 = new ArrayList<>(Arrays.asList("Natasha Romanoff"));

            list.add(new Customer("ABC123", passenger1, interests1));
            list.add(new Customer("ABC124", passenger2, interests2));
            list.add(new Customer("ABC125", passenger3, interests3));
            list.add(new Customer("ABC126", passenger4, interests4));
            list.add(new Customer("ABC127", passenger5, interests5));
        }
        return list;
    }
}
