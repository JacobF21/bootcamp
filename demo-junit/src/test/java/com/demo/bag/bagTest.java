package com.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import com.demo.bag.Bag;
import com.demo.bag.Ball;
import com.demo.bag.Color;

public class bagTest {
  @Test
  void testBag(){
    Bag b1 = new Bag();
    b1.add(3,Color.BLUE);
    b1.add(4,Color.WHITE);
    b1.withdraw();
    assertEquals(b1.size(), 1);
  }

  @Test
  void testBags(){
    Bag b2 = new Bag();
    b2.add(3,Color.BLUE);
    b2.add(4,Color.WHITE);
    b2.withdraw();
    b2.withdraw();
    assertThrows(IllegalStateException.class,()-> b2.withdraw());
    assertEquals(b2.size(), 0);
  }

  @Test
  void testBag3(){
    Bag b1 = new Bag();
    b1.add(3, Color.BLUE);
    Ball ball = b1.withdraw();
    assertAll(
      ()-> assertEquals(Color.BLUE, ball.getColor()),
      ()-> assertEquals(3, ball.getValue())
    );
  }
}
