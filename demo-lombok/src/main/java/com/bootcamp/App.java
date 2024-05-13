package com.bootcamp; // similar to sub-folder, group_id

import java.util.ArrayList;
import java.util.List;

//.jar bundle of a lot of class
//java lang....
//Create Java Project -> JDK(java.lang)
//but you need to explicitly import java.util, etc

//Command "mvn compile" -> check dependency in pom.xm; -> download dependency
//Java Project = JDK + junit + lombok
//target folder -> generated main + test class files (similar to javac)

//Command "mvn clean" -> clean target folder
//Command "mvn clean compile"


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StringBuilder sb = new StringBuilder();// Java lang not need to import
        int x = (int) Math.pow(2.0,2.0);
        List<String> s = new ArrayList<>();
    }
}
