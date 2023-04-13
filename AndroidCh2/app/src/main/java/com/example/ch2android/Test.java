package com.example.ch2android;

public class Test {
    int a = 10;
    public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException {
        //1. using new keyword
        Test test1 = new Test();

        //2.using class.name method " return class object
       // Test test2 = (Test)Class.forName("com.example.androidwork.Test").newInstance();

        //3.using clone() method : it is present in Object Class
        Test test3 = (Test)test1.clone();

        int a1 = test3.a;
        System.out.println(a1);

    }
}