package com.example.ch2android;

public class Inheritence {

    public static void main(String[] args) {
        //single inheritence
        Audi audi = new Audi();
        audi.drive(); //inherite car class method
        audi.carName = "Audi";
        audi.carName();

        //multi level
        AudiModel2 audiNewModel = new AudiModel2();
        audiNewModel.carName = "Audi 2.0";
        audiNewModel.carName();
        Audi audi2 = new Audi();
        audi2.drive();
    }
}

//single inheritence
class Car {
    String carName;
    void drive() {
        System.out.println("car is drive");
    }
}
class Audi extends Car{
    void carName() {
        System.out.println("car brand is " + carName);
    }
}

//multi-level inheritence

class  AudiModel2 extends Audi {
  void newModel() {
      System.out.println("this is audi new model launch");
  }
}

//hiarchial


class A {
    void callA() {
        System.out.println("this is a class A method called");
    }
}
class B extends A {
    void callB() {
        System.out.println("this is a class B method called");
    }
}
class C extends A {
    void callC() {
        System.out.println("this is a class C method called");
    }

    public static void main(String[] args) {
        C objC = new C();
        objC.callA();

        B obcB = new B();
        obcB.callA();
    }
}

//hybrid inheritence

// M -> N, M -> P, N -> R, P -> R
class P {

}
class  N {

}
class  M extends P{

}
class R1 {

}
//Aggregation
class Address {
    String city;
    String state;
    String country;

    public Address(String city,String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
//    public Address(String city,String state) {
//        this.city = city;
//        this.state = state;
//        this.country = "India";
//    }

    public static void main(String[] args) {
//        Address address = new Address("Rajkot","Gujrat");
//        System.out.println(address.country);
    }
}

class  Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void displayAllInfo() {
        System.out.println("id : " + id + " Name :" + name );
        System.out.println("Address : " + address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Ahamdabad","Gujrat","India");
        Employee emp1 = new Employee(1,"Shyam",address1);
        emp1.displayAllInfo();
    }
}

//multiple inheritence using interface

interface A1 {
    void eat();
}

interface B2 {
    void code();
}

class MultipleInheritence implements A1,B2 {
    @Override
    public void eat() {
        System.out.println("I am eatting");
    }

    @Override
    public void code() {
        System.out.println("i am write a code.");
    }

    public static void main(String[] args) {
        MultipleInheritence multipleInheritence = new MultipleInheritence();
        multipleInheritence.eat();
        multipleInheritence.code();
    }
}
//above using abstraction
class MultipleInheritence1 extends C11  implements B2 {

    @Override
    public void code() {
        System.out.println("i am write a code.");
    }


    public static void main(String[] args) {
        MultipleInheritence1 multipleInheritence1 = new MultipleInheritence1();
        multipleInheritence1.eat();
        multipleInheritence1.code();
    }
}
abstract class C11 implements A1 {
    @Override
    public void eat() {
        System.out.println("eatting");
    }
}

