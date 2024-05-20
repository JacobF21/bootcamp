package com.demo;


import static org.hamcrest.MatcherAssert.*;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  public static void main(String[] args) {
    String actualValue="Hello";
    String expectedValue="Hello";

    //Junit 5
    Assertions.assertEquals(actualValue,expectedValue);

    //Hamcrest
    assertThat(actualValue, Matchers.is(Matchers.equalTo(expectedValue)));
    assertThat(actualValue, Matchers.is(Matchers.not(Matchers.equalTo(expectedValue))));

    //Null Value Check
    String s1 = null;
    assertThat(s1, Matchers.is(Matchers.nullValue()));
    String s2 = "abc";
    assertThat(s2, Matchers.is(Matchers.nullValue()));

    //Same instance
    String s3 = "Hello";
    String s4 = "Hello";
    String s5 = new String("Hello");
    assertThat(s3, Matchers.is(Matchers.sameInstance(s4)));
    assertThat(s3, Matchers.is(Matchers.not(Matchers.sameInstance(s4))));

    assertThat(42, Matchers.allOf( //
              greaterThan(41),//
              greaterThanOrEqualTo(42),//
              equalTo(42),
              lessThan(43),
              lessThanOrEqualTo(42)//
    ));
  }
}
