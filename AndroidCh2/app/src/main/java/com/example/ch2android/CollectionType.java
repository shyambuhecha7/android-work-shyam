package com.example.ch2android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionType {

    public static void main(String[] args) {

        //collection and lamdas
        //List :
        //first way
        List<String> list = new ArrayList<>();
        list.add("Shyam");
        list.add("Darshan");
        list.add("Shubham");
        System.out.println(list);
        System.out.println();

        //Second way
        List<String> list1 = Arrays.asList("name","surname","address");

        //print all element
        list.forEach(System.out::println);
        list1.forEach(System.out::println);

    }
}

//map  :it is interface and it map a value
class CollectionMap {

    public static void main(String[] args) {
        Map<Integer,String> map =  Map.of(1,"One",2,"Two");
        Map.entry(3,"Three");

        // using new
        Map<String,String> map1 = new HashMap<>();

        map.forEach((k,v) -> System.out.printf("%s  %s \n", k, v));

    }
        }

