package com.example.ch2android;

public class Polymorphism {

}
//method  MethodOverLoading : 1) changing name of argu, 2) changing data type of argument

class  MethodOverLoading {
    void add(int n1,int n2, int n3) {
        System.out.println("addition : " + (n1 + n2 + n3));
    }
    void add(int n1,int n2) {
        System.out.println("addition : " + (n1 + n2 ));
    }void add(Double n1,Double n2, Double n3, Double n4) {
        System.out.println("addition : " + (n1 + n2 + n3 + n4));
    }
    void add(int n1,Double n2) {
        System.out.println("addition : " + (n1 + n2));
    }


    public static void main(String[] args) {
        MethodOverLoading overLoading = new MethodOverLoading();
        overLoading.add(12,10,23);
        overLoading.add(10,12.5);
    }
}

//Overriding :
class Fruit {
    void eat() {
        System.out.println("i am eating fruit");
    }
}

class Mango extends Fruit{
    void eat() {
        System.out.println("I am eating a Mango");
    }

    public static void main(String[] args) {
        Mango mango = new Mango();
        mango.eat();
    }
}

//covariant return type
class S {
    S get() {
        return this;
    }
}

class T extends S{
    @Override
    T get() {
        return this;
    }
    void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        T t = new T();
        t.get().print();
    }
}
//super

class Bike {
    String color = "Black";
}
class Bike1 extends Bike {
    String color = "Blue";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    public static void main(String[] args) {
        Bike1 bike1 = new Bike1();
        bike1.printColor();
    }
}