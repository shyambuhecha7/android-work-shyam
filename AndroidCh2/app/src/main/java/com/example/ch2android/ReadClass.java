package com.example.ch2android;

//Read-Only class
public class ReadClass {
    private String company = "Simform";

    public String getCompany() {
        return company;
    }


    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        readClass.getCompany();
    }
}
