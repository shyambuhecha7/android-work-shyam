package com.example.ch2android;

public class Enum {
    //enum can declare inside and outside of the class
    enum Pizza {
         SMALL,
         MEDIUM,
         LARGE
    }
    public static void main(String[] args) {

        Pizza pizza = Pizza.MEDIUM;
        System.out.println("Pizza Size is " + pizza);

    }
}
