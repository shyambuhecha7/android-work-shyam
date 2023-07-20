package com.example.ch2android;

public class ControlFlow {
    public static void main(String[] args) {

        //select Statement : if-else , switch-case
        //code in Condition_Decision.javafile

        //iterate Statement : for, while, do-while
        int count = 1;
        while (count < 5) {
            System.out.println(count);
            count++;
        }

        int sum = 0;
        do {
            sum += count;
            count++;
        }while (count <=10);
        System.out.println("Sum : " + sum);

        int multiplicationTableOf = 7;
        for(int i = 1; i <= 10; i++) {
            System.out.println(multiplicationTableOf + " x " + i + " = " + (i* multiplicationTableOf));
        }
        //exception handle statement : throw, try-catch-finally
        //show in Exception.java file
    }



}
