package com.demo;

// static import
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

//We can use static import to import all static methods of the whole class
public class calculatorTest 
{
@Test
void testSum(){
    int actual = Calculator.sum(3, 4);
    assertEquals(7,actual);
    assertEquals(-10,Calculator.sum(-1, -9));
    assertEquals(0,Calculator.sum(0, 0));
    }

//Test-Driven Design
@Test
void testSubtract(){
    assertEquals(8,Calculator.substract(-1, -9));
    assertEquals(8,Calculator.substract(10, 2));
    assertEquals(0,Calculator.substract(2, 2));
    }

@Test
void testSort(){
    int[] arr = new int[] {2,4,3,1};
    Calculator.sort(arr);
    assertArrayEquals(new int[]{1,2,3,4} ,arr);
    // Assertions.assertEquals(8,Calculator.substract(10, 2));
    // Assertions.assertEquals(0,Calculator.substract(2, 2));
    int[] arr2 = new int[] {};
    Calculator.sort(arr2);
    assertArrayEquals(new int[]{} ,arr2);
    }

@Test
void testConcat(){
    List<String> test = new ArrayList<>(Arrays.asList("abc", "def", "ghi", "jkl"));
    String ans ="abcdefghijkl";
    assertEquals(ans, Calculator.concat(test));
}

@ParameterizedTest
@CsvSource({
    "2,1,1",
    "100,49,51"
})
void testSumEqual(int expected, int x, int y){
    assertEquals(expected, Calculator.sum(x,y));
}

@ParameterizedTest
@CsvSource({
    "2,5,1",
    "100,23,51"
})
void testSumNotEqual(int expected, int x, int y){
    assertNotEquals(expected, Calculator.sum(x,y));
}


}
