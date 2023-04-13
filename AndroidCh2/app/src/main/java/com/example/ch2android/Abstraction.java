package com.example.ch2android;

public class Abstraction {

}

abstract class Sample {
    abstract void printName();



}

class  Demo extends Sample {
    @Override
    void printName() {
        System.out.println("Shyam");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.printName();
    }
}

//using interface
interface I {
    void printOne();
    void printTwo();
    void printThree();

}


class H implements I {
    @Override
    public void printOne() {
        System.out.println(1);
    }

    @Override
    public void printTwo() {
        System.out.println(2);
    }

    @Override
    public void printThree() {
        System.out.println(3);
    }



    public static void main(String[] args) {
        H h = new H();
        h.printOne();
        h.printTwo();
        h.printThree();

    }
}