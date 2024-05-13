package com.bootcamp;

public class Cat {
  private int age;
  private String name;

  public Cat(String name, int age){
    if(name == null){
      throw  new NullPointerException("Name cannot be null when create cat onject");
    }
    this.name = name;
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    Cat cat = new Cat("Peter",10);
  }
}
