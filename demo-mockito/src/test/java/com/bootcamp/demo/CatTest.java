package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
  @Test
  void testSum(){
    Cat cat = new Cat();
    Assertions.assertEquals(10, cat.sum(3,7));
    Assertions.assertEquals(10, cat.sum(10000,-9990));
    Assertions.assertEquals(10, cat.sum(2,8));
    Assertions.assertEquals(10, cat.sum(-50,60));
    Assertions.assertEquals(10, cat.sum(-20,30));
  }
}
