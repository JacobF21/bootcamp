package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class stringCheckerTest {
@Test
  void testIsPalindrome(){
    assertTrue(StringChecker.isPalindrome("racar"));
    assertFalse(StringChecker.isPalindrome("raca"));
  }

@Test
  void testSameString(){
    String s1 = "hello";
    String s2 = new String("hello");
    assertFalse(s1==s2);
    assertNotSame(s1,s2);

    String s3 = "hello";
    assertSame(s1,s3);
    assertEquals(s2,s3);
  }
}
