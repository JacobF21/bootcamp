package com.bootcamp.demo2403; // similar to sub-folder, group id

import java.util.ArrayList;
import java.util.List;

// java.lang ....

// Create Java Project -> JDK (java.lang)
// but you need to explicitly import java.util, etc.

// Command "mvn compile" -> check dependency in pom.xml -> download dependency
// Java Project = JDK + junit + lombok
// target folder -> generated main + test class files (similar to javac)

// Command "mvn clean" -> clear target folder

// Command "mvn clean compile" -> clear target folder, check dependency, compile class folder

// Command "mvn clean install" -> 
// clear target folder, check dependency, compile class folder, bundle a single jar (representing all class files)

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!!!!!!!");

    StringBuilder sb = new StringBuilder();
    int x = (int) Math.pow(2.0, 2.0);
    
    Cat cat = new Cat("Vincent", 13);
    List<String> s = new ArrayList<>();

  }
}
