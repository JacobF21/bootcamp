package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Annotations
@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter

public class Dog {
  private String name;
  private int age;

  //Custom Constructor
  public Dog(String name){
    this.name=name;
  }

  public static void main(String[] args) {
    Dog dog = new Dog("Leo",5);    
    Dog dog2 = new Dog("John");    
    dog2.setAge(10);
    System.out.println(dog.getAge());
    System.out.println(dog2.getAge());
  }

}