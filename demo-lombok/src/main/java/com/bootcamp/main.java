package com.bootcamp;

import java.time.LocalDate;

public class main {
  public static void main(String[] args) {
    // Student student1 = new Student("Vincent", 10);
    // Student student2 = new Student("Vincent", 10);
    // Student student3 = new Student("Peter", 5);
    // System.out.println(student1==student2);
    // System.out.println(student1.equals(student2));
    // System.out.println(student1==student3);
    // System.out.println(student1.equals(student3));
    // System.out.println(student1.hashCode());
    // System.out.println(student2.hashCode());
    // System.out.println(student3.hashCode());
    // System.out.println(student1.toString());

    Customer c1 = new Customer("Wong");
    Customer c2 = new Customer("Li");
    Order o1=new Order("1");
    Order o2=new Order("2");
    Order o3=new Order("3");
    c1.addOrder(o1);
    c1.addOrder(o2);
    c2.addOrder(o3);
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c1.equals(c2));
    System.out.println(c1.getOrderSize());
    System.out.println(c1.isVIP());

    Student s1 = new Student(null,10);

    //Staff staff =Staff.builder().name("Vincent").joinDate(LocalDate.of(2023,4,30)).build();
  }
}
