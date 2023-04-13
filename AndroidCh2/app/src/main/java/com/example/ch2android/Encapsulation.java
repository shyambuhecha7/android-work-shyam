package com.example.ch2android;

public class Encapsulation  {
  private String name;

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Shyam");
        System.out.println(encapsulation.getName());
    }
}

//read class
class ReadClass1 {
    private String company = "Simform";

    public String getCompany() {
        return company;
    }

    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        String company = readClass.getCompany();
        System.out.println(company);
    }
}
//write only
class WriteOnly {
    private int number = 5;

    public void setNumber(int number) {
        this.number = number;
    }
    public static void main(String[] args) {
        WriteOnly write = new WriteOnly();
        write.setNumber(10);
    }
}