package com.example.ch2android;

import java.io.IOException;

public class ExceptionHandling {

    void showException() throws IOException {
        throw new IOException("Device error occur");
    }

    public static void main(String[] args) {
        try{
            int division = 10/0;
        }catch(Exception e) {
            System.out.println("Exception is : " + e);
        }finally {
            //it is use to cleanup the code. like closing file
            System.out.println("Finally bleck always execute");
        }

        //throw
        int age = 17;
        if(age < 18){
         //   throw new ArithmeticException("person not valid for voting");
            System.out.println(" ");
        }

        //throws
      ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            exceptionHandling.showException();
        } catch (IOException e) {
            System.out.println("Exception handle");
        }

        //finally,final,finalize

        final int finalValue = 10;
       // finalValue = 20; //can not change because final keyword

        try {
            int calculation = 20/0;

        }catch (Exception e){
            System.out.println("Exeception  : " + e);
        }finally {
            System.out.println("Finally always execute");
        }
    }
}
//finalize
class FinalizeExample {
    public static void main(String[] args) {

        FinalizeExample finalizeExampleObj = new FinalizeExample();

        System.gc(); // calling garbage collection

        finalizeExampleObj = null;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("Finalize Method called");
    }
}