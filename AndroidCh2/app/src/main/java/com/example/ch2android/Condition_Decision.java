package com.example.ch2android;

public class Condition_Decision {
    public static void main(String[] args) {

        //if
        String user = "Shyam";
        int id = 7;
        if(id == 7){
            System.out.println("id is same");
        }
        //if-else
        if (user == "Shyam") {
            System.out.println("Authentication is successfully completed.");
        }else {
            System.out.println("Authentication is failed.");
        }
        //nested-if
        if (id < 10){
            if(id == 7){
                System.out.println("id is 7");
            }else {
                System.out.println("id is not 7");
            }
        }else {
            System.out.println("id is greter than 7");
        }
        //if else if

        if (user == "Shyam"){
            System.out.println("Shyam Authentication is successfully completed.");
        } else if (user == "Darshan") {
            System.out.println("DarshanAuthentication is successfully completed.");
        }else if (user == "shubham"){
            System.out.println("Shubham Authentication is successfully completed.");
        }else {
            System.out.println("User is not matching..");
        }

        //switch case
        int value = 3;
        switch (value) {
            case 1 : System.out.println(1);
                break;
            case 2 : System.out.println(2);
                break;
            case 3 : System.out.println(3);
                break;
            default: System.out.println("not match");
        }

        //jump  = continue,break,return
    }
}
