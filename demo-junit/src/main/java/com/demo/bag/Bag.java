package com.demo.bag;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Bag {
  List<Ball> balls;

  public Bag(){
    this.balls = new LinkedList<>();
  }

  public boolean add(int value, Color color){
    balls.add(Ball.of(value, color));
    return true;
  }

  public Ball withdraw(){
    // int count = balls.size();
    // Ball result = new Ball();
    // int random = new Random().nextInt(count);
    // result = balls.get(random);
    // balls.remove(random);
    // return result;
    if(this.balls.size()<1){
      throw new IllegalStateException();
    }
    int idx = new Random().nextInt(this.balls.size());
    return this.balls.remove(idx);
  }

  public int sumOfValues(){
    return this.balls.stream()
          .mapToInt(e->e.getValue())
          .sum();
  }

  public int size(){
    return balls.size();
  }

}
