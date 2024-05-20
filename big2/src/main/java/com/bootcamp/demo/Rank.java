package com.bootcamp.demo;

import lombok.Getter;

@Getter
public enum Rank {
  ONE(14),
  TWO(15),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(11),
  QUEEN(12),
  KING(13);

  private final int rank;

  private Rank(int rank){
    this.rank=rank;
  }


}
