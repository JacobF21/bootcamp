package com.demo.bag;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Ball {
  private int value;
  Color color;

  public static Ball of(int value, Color color){
    Ball ball = new Ball(value, color);
    return ball;
  }




}
