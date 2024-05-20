package com.bootcamp.demo;

public class Superman {
  private Cat cat;

  public Superman(Cat cat){
    this.cat=cat;
  }


  public int sum(int x){
    if(this.cat.sum(x,10) + this.cat.substract(100, x)>5){
      return 99;
    }
    return 50;
  }

}
