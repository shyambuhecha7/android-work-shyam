package com.example.ch2android;

public class ClassAndObject {

    //instance variable
    String name;
    int age;
    String city;

    //constructor
    public ClassAndObject(String name, int age, String city) {
        this.name = name;
        this.city = city;

        this.age = age;
    }

    //methods
    public  String getName() {
        return name;
    }

    public  String getCity() {
        return  city;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {


        //class object  : contain state : attribute(variable) ,behavior : (methods) ,identity : (unique name of object)
        //initialize object
        /*
        ClassAndObject person = new ClassAndObject();
        person.name = "Shyam";
        person.age = 21;

        System.out.println("name : " + person.name + "\n" + "Age : " + person.age );
        */

        ClassAndObject person = new ClassAndObject("Shyam", 21,"Rajkot");
        System.out.println("name : " + person.getName() + "\n" + "Age : " + person.getAge()+ "\n"  + "City : " + person.getCity());

    }

}
class  Item {
    static String itemName;
    static int itemPrice;

    static void set(String name, int price) {
        itemName = name;
        itemPrice = price;
    }

    static void get() {
        System.out.println("name : " + itemName + "\n itemPrice : " + itemPrice);
    }
    public static void main(String[] args) {
        Item.set("Bag",1500);
        Item.get();

    }
}



