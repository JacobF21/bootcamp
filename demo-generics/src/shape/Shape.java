package shape;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


public interface Shape {
  //attribute
  double area();

  //default method -> instance method
  
  //static method
  static double area(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0);
    for(Shape s:shapes){
      bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  static <T extends Shape > double area2(List<T> shapes){
    BigDecimal bd = BigDecimal.valueOf(0);
    for(Shape s:shapes){
      bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  //Polymorphism -> Data Structure
  static <T extends Collection<Number>> double area3(T shape){
    //Queue<Number>
    //Set<Number>
    //List<Number>
    return -1;
  }

  static <T extends Collection<? extends Shape>> double area4(T shapes){
    BigDecimal bd = BigDecimal.valueOf(0);
    for( Shape s:shapes){
      bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  // static <T extends Collection<? extends Number>> double area5(T shapes){
  //   BigDecimal bd = BigDecimal.valueOf(0);
  //   for( Number num:shapes){
  //     bd.add(BigDecimal.valueOf(num.area()));
  //   }
  //   return bd.doubleValue();
  // }



  public static void main(String[] args) {
    Circle c = new Circle(3.0d);
    Square s = new Square(5.0d);
    List<Shape> shapes = new LinkedList<>();
    shapes.add(c);     
    shapes.add(s);
    
    List<Object> shapes2 = new LinkedList<>();
    shapes2.add(c);
    shapes2.add(s);
    shapes2.add(new Object());

    for(Object o: shapes2){
      //o.area();
    }

    List<Object> objects = new LinkedList<>();
    objects.add(new Circle(3.4d));

    Queue<Long> ql =  new LinkedList<>();
    //Shape.area4(ql);
    
    Queue<Number> qn = new LinkedList<>();
    qn.add(1L);
    Shape.area3(qn);

    Set<Number> sn = new HashSet<>();
    sn.add(1L);
    Shape.area3(sn);




    
  }
}
