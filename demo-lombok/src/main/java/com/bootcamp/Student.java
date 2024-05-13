package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor

public class Student {
  @Getter @Setter
  private String name;
  @Getter @Setter
  private int age;

  public Student (@NonNull String name, int age){
    this.name=name;
    this.age=age;
  }



  public static void main(String[] args) {
    Student s1 = new Student("Vincent", 4);
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
  }
}
