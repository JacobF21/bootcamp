package com.demo;

public class StringChecker {
  public static boolean isPalindrome(String s){
    StringBuilder sb = new StringBuilder(s);
    if(s.equals(sb.reverse().toString())){
      return true;
    }
    return false;
  }
}
